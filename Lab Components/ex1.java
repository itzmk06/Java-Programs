import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class ex1 {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result of performing division: " + result);
        } catch (CustomArithmeticException e) {
            System.err.println("CustomArithmeticException: " + e.getMessage());
        }

        try {
            String nullString = null;
            int length = getStringLength(nullString);
            System.out.println("Length of string: " + length);
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: " + e.getMessage());
        }

        try {
            int[] numbers = {1, 2, 3};
            int value = getArrayValue(numbers, 5);
            System.out.println("Value at index 5: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            readFile("name1.txt");
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }

    private static int divide(int numerator, int denominator) throws CustomArithmeticException {
        if (denominator == 0) {
            throw new CustomArithmeticException("Cannot divide by zero in a custom way.");
        }
        return numerator / denominator;
    }

    private static int getStringLength(String str) {
        if (str == null) {
            throw new NullPointerException("String reference is null.");
        }
        return str.length();
    }

    private static int getArrayValue(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return array[index];
    }

    private static void readFile(String filePath) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }
}
