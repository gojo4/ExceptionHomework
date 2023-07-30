package homework2;

/**
 * Если необходимо, исправьте данный код.
 */
public class Task2 {
    public static void main(String[] args) {
        divisionOnZero();
    }

    public static void divisionOnZero() {
        try {
            int[] intArray = {1, 2, 4, 5, 6, 8, 3, 7, 134, 63};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
