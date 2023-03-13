//Q6 Answer : A output : A's no-arg constructor is invoked   , b error is class b doesn't have the same arguements like A.
//Q7 Answer :  L27 : Circle.getArea() * lenght;
//Q8 Answer : The method is overridden.
//Q9 Answer : There will be no problem.

public class main{
    public class Myinteger {
        private int value;
        public  Myinteger(int Value){
            value= Value;
        }
       public int getValue(){
           return value;
       }
        public void setValue(int Value) {
            value = Value;
        }
        public boolean isEven(){
           if(value%2==0){
               return true;
           }
           else {
               return false;
           }
        }
        public boolean isOdd(){
            if(value%2==1){
                return true;
            }
            else {
                return false;
            }
        }
        public boolean isPrime(){
           for(int i = 2 ; i*i<= value; i++){
              if(value%i==0) {
                  return false;
              }
           }

                return true;
       }
       public boolean isEqual(int x){
            if(value==x){
                return true;
            }
            else{
                return false;
            }
       }
    }
    public static void main(String[] args) {
    Myinteger x = new Myinteger(64);
    x.isEven();
    x.isOdd();
    x.isPrime();
    x.isEqual(64);
    }
}