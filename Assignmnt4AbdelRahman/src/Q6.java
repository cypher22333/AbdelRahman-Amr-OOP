import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Q6 {
    public static void main(String args[]){
        System.out.println("Enter file name:");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        File file = new File(filename);
        try{
            Scanner sc = new Scanner(file);
            String s1;
            int lines=0;
            int chars=0;
            int words=0;
            while(sc.hasNextLine()){
                s1=sc.nextLine();
                int i=0;
                if(i==0 && !s1.isEmpty()) words++;
                for(i=0;i<s1.length();i++){
                    chars++;
                    if(s1.charAt(i)==' ') words ++;
                }
                lines++;
            }
            System.out.println("Lines: "+lines+"\nWords: "+words+"\nCharacters: "+chars);
        }
        catch(IOException e){
            System.out.println("File not found.");
        }
    }
}
