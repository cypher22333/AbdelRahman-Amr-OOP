//Assignment Q4
import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;
import java.io.PrintWriter;

public class Q4 {
    /*public static void main(String args[]){
        System.out.println("Enter file name:");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        File file = new File(filename);
        try {
            Scanner sc = new Scanner(file);
            File file1 = new File(filename+"1.txt");
            String str;
            System.out.println("Enter string to remove: ");
            String target = scanner.nextLine();
            PrintWriter output= new PrintWriter(file1);
            while(sc.hasNextLine()){
                String s1=sc.nextLine();
                output.println((s1.replaceAll(target,"")));
            }
            sc.close();
            output.close();
            file.delete();
            file1.renameTo(file);

        }
        catch(IOException e){
            System.out.println("File not found.");
            System.exit(1);
        }

    }*/
}
