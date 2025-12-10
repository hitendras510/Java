import java.io.*;
import java.util.Scanner;

public class Main {

    // Create a new file
    static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + fileName);
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    // Write data into file
    static void writeData(String fileName, String data) {
        try {
            FileWriter writer = new FileWriter(fileName, true); // append = true
            writer.write(data + "\n");
            writer.close();
            System.out.println("Data written successfully.");
        } catch (Exception e) {
            System.out.println("Error writing data: " + e.getMessage());
        }
    }

    // Read data from file
    static void readData(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Delete file
    static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Create File");
        System.out.println("2. Write Data");
        System.out.println("3. Read Data");
        System.out.println("4. Delete File");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Enter file name to create: ");
                String createName = sc.nextLine();
                createFile(createName);
                break;

            case 2:
                System.out.print("Enter file name to write into: ");
                String writeFile = sc.nextLine();
                System.out.print("Enter data: ");
                String data = sc.nextLine();
                writeData(writeFile, data);
                break;

            case 3:
                System.out.print("Enter file name to read: ");
                String readFile = sc.nextLine();
                readData(readFile);
                break;

            case 4:
                System.out.print("Enter file name to delete: ");
                String delFile = sc.nextLine();
                deleteFile(delFile);
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
