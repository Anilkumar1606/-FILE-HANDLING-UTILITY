# FILE-HANDLING-UTILITY

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: CHAVVAAKULA ANIL KUMAR 

*INTERN ID*: CT04DL445

*DOMAIN*: Java Programming

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTHOSH KUMAR

The FileManager Java program is a simple console-based application that allows users to perform three key file operations—write, read, and modify—on a text file named file.txt. It provides a user-friendly menu interface and uses standard Java I/O classes to handle file input and output.

🔧 Program Structure
The main class FileManager contains the main() method, which continuously displays a menu with four options:

Write to File

Read from File

Modify File Content

Exit the Program

The program uses the Scanner class to take user input. The menu runs in an infinite loop until the user chooses to exit.

✏️ Write to File
When the user selects option 1, they are prompted to enter text. The writeToFile() method uses a FileWriter to write the input into file.txt. It overwrites any existing content. If an error occurs during writing, an IOException is caught and an error message is displayed.

📖 Read from File
Option 2 reads and displays the contents of the file using a BufferedReader wrapped around a FileReader. If the file does not exist, the program informs the user. The content is printed line by line.

🔁 Modify File Content
Option 3 allows the user to replace specific text in the file. The modifyFile() method reads all content using a BufferedReader, replaces all instances of the target text using String.replace(), and then writes the modified content back to the file using a FileWriter.

⚙️ Error Handling and Design
The program uses try-with-resources blocks to automatically close readers and writers, preventing resource leaks. All I/O operations are wrapped in try-catch blocks to handle potential exceptions gracefully.

✅ Conclusion
This program demonstrates core Java file handling concepts with a clean, interactive interface. It is ideal for learning how to manipulate files using Java.



#OUTPUT:

![Image](https://github.com/user-attachments/assets/bd91daa2-ecfd-48b6-8642-5d805e9c2f93)


![Image](https://github.com/user-attachments/assets/1c744285-2cb8-4640-9b52-9107c437a0ec)
