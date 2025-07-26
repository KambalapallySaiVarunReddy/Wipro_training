package Day7;
import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the index to access: ");
        int index = sc.nextInt();

        try {
            System.out.println("Element at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }

        System.out.println("Program continues after exception handling.");
        sc.close();
    }
}

