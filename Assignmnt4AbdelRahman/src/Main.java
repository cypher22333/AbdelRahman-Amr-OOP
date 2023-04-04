//Assignment Q2,3
//Q2:
//Output is "RuntimeException"

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
/*    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<5;i++){
            list.add(scanner.nextInt());

        }
        sort(list);
        for(Integer i:list){
            System.out.println(i.intValue());
        }
    }*/
    static void sort(ArrayList<Integer> list){
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(list.get(i).intValue()>list.get(j).intValue()){
                    Integer temp = list.get(j);
                    list.set(j,list.get(i));
                    list.set(i,temp);
                }
            }
        }
    }
}