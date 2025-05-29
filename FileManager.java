import java.io.*;
import java.util.Scanner;

public class FileManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "file.txt";

        while (true) {
            System.out.println("\n FILE OPERATIONS MENU");
            System.out.println("1. Write to File");
            System.out.println("2. Read from File");
            System.out.println("3. Modify File Content");
            System.out.println("4. Exit");
            System.out.println("Choose an option (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                System.out.println("Enter text to write to the file: ");
                String content = scanner.nextLine();
                writeToFile(fileName, content);
                break;

                case 2:
                readFromFile(fileName);
                break;

                case 3:
                System.out.println("Enter the text you want to replace: ");
                String oldText = scanner.nextLine();
                System.out.println("Enter the new text: ");
                String newText = scanner.nextLine();
                modifyFile(fileName, oldText, newText);
                break;

                case 4:
                System.out.println("Exiting program.");
                scanner.close();
                return;

                default:
                System.out.println("Invalid choice. Please enter a number between 1 to 4.");


            }
        }
    }

    public static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void readFromFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File does not exist. Please write data first.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("\n File Content");
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("----------------------------");
        } catch (IOException e) {
            System.out.println("Error reading file: "+ e.getMessage());
        }
    }


    public static void modifyFile(String fileName, String oldText, String newText) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File does not exist. Please write data first.");
            return;
        }

        StringBuilder newContent = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = reader.readLine()) != null) {
                newContent.append(line.replace(oldText, newText)).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error reading file for modification: " + e.getMessage());
            return;
        }

        try(FileWriter writer = new FileWriter(file))
        {
            writer.write(newContent.toString());
            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.out.println("Error writing modified content: "+ e.getMessage());
        }
    }
}
