import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.println("Welcome!");
            System.out.println("This is a simple program that allows you to save whatever your imaginative brain wants to think of.");
            System.out.println("Just follow the directions and go crazy with your imagination :)");
            System.out.println("Choose an option:");
            System.out.println("1: Input a sentence and write to file.");
            System.out.println("2: Read the contents of the file.");
            System.out.println("3: Exit.");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            switch (choice) {
                case 1:
                    // Input a string and append to the file
                    System.out.println("Please enter a sentence to write to the file: ");
                    userInput = scanner.nextLine();

                    // Append the input to the file
                    try (FileWriter writer = new FileWriter("output.txt", true)) {
                        writer.write(userInput + System.lineSeparator());
                        System.out.println("Successfully appended to the file 'output.txt'.");
                    } catch (IOException e) {
                        System.out.println("An error occurred while writing to the file.");
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    // Read and display the content of the file
                    System.out.println("Reading the contents of 'output.txt':");
                    try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        System.out.println("An error occurred while reading the file.");
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }
        }
    }
}