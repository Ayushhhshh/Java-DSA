import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to take as input:");
        int numberOfInputs = scanner.nextInt(); // You can change this to 5 if needed
        int[] inputs = new int[numberOfInputs];

        System.out.println("Please enter " + numberOfInputs + " numbers:");

        for (int i = 0; i < numberOfInputs; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            inputs[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int input : inputs) {
            System.out.println(input);
        }

        scanner.close();
    }
}
