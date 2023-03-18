import java.util.ArrayList;
public class Main {

    public static Integer max(ArrayList<Integer> list) {
    if(list.size()==0){
        return null ;
    }
        int x =list.get(0);
        for(int i=0;i<list.size();i++){
          if( x < list.get(i) ){
              x = list.get(i);
          }
        }
        return x;
      }
    public static void sort(ArrayList<Integer> list){
        if(list.size()==0){
            System.out.println("IT IS EMPTY");
        }
        for(int l=0;l<list.size();l++){
        for(int i=0;i < list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                int x= list.get(i);
                list.set(i,list.get(i+1));
                list.set(i+1,x);
            }
        }}
        for(int i=0;i< list.size();i++){
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        ArrayList <Integer> x = new ArrayList<>(6);
        x.add(5);
        x.add(4);
        x.add(3);
        x.add(2);
        x.add(1);
        sort(x);

    }
}