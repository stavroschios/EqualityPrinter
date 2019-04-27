public class EqualityPrinterInt {

    private static final String INVALID_VALUE = "Invalid Value";
    private static final String EQUAL_NUMBERS = "All numbers are equal";
    private static final String DIFFERENT_NUMBERS = "All numbers are different";

    public static void printEqual( int a, int b, int c) {
        if ( (a < 0 ) || (b < 0) || ( c < 0)) {
            System.out.println(INVALID_VALUE);
        }
        else if ((a == b) && (a == c) && (b == c)){
            System.out.println(EQUAL_NUMBERS);
        }
        else if ((a != b) &&(a !=c ) && (b != c)) {
            System.out.println(DIFFERENT_NUMBERS);
        }
        else {
            System.out.println("Neither all are equal or different");
            }
    }

    public static void main(String[] args) {
        printEqual(-1, 2 ,3);
    }
}
