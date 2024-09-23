import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) throws Exception {

        // File class is for general file system tasks
        try {
            // Try to create new file
            File myFile = new File("mydata.txt");        
            myFile.createNewFile();
            System.out.println("File " + myFile.getName() + " created");

        } catch (IOException e) {
            System.out.println("Error in file creation!");
            e.printStackTrace();
        } finally {
            // System.out.println("Hi, I am always executed! You can use me for cleaning up your tries.");
        }
        
        // Write to files using PrintStream  
        Integer[] dataSet = { 1, 1, 2, 3, 5, 8, 13, 21 };        
        PrintStream writer = null;
        try {
            // Open file for writing using PrintStream
            // Good for writing human readable files
            writer = new PrintStream("mydata.txt");
            // Write data using foreach
            for (Integer i: dataSet) {
                writer.println(i);
            }
            System.out.println("Data written to file");
        } catch (IOException e) {
            System.out.println("Error in writing to file!");
            e.printStackTrace();
        } finally {
            writer.close();
        }

        // Read from files using good old Scanner 
        Scanner reader = null;
        try {
            System.out.println("Reading data from file");
            File myFile = new File("mydata.txt");
            reader = new Scanner(myFile);
            // Read until scanner stream empty
            while (reader.hasNext()) {
                System.out.println(reader.nextInt());
            }
        } catch (Exception e) {
            System.out.println("Error in reading from file!");
            e.printStackTrace();
        } finally {
            reader.close();
        }

    }
}
