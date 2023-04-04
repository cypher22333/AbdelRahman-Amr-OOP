//Q7 ANSWER : Accessor is the get , mutator is the set.
//Q8 ANSWER : Increase safety and not anyone can access anything.
//Q9 ANSWER : I can't use test without it being static.
 class Account {
    private int id;

    private double balance;
    private double rate;
    private String date;
    public Account (){

    }
    public Account (int Id,double Balance, double Rate,String Date){
        id=Id;
        balance=Balance;
        rate=Rate;
        date=Date;
    }
    public int getId(){
        return id;
    }
    public void setId(int Id){
        id=Id;
    }

    public double getbalance(){
        return balance;
    }
    public void setBalance(double Balance){
        balance=Balance;
    }
    public double getRate(){
        return rate;
    }
    public void setRate(double Rate){
        rate=Rate;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String Date){
        date=Date;
    }
    public double getmonthrate(){
        double monthrate = rate /12;
        System.out.println(monthrate);
        return monthrate ;
    }
    public double getmonthratemoney(){
        double monthrate = rate /12;
        double money = (monthrate * balance)/100;
        System.out.println(money);
        return money;
    }
    public double withdraw(double x){
        balance = balance - x;
        System.out.println(balance);
        return balance;
    }
    public double deposit(double y){
        balance = balance + y;
        System.out.println(balance);
        return balance;
    }
    public void printall(){
        System.out.println("" +id +" "+ balance+"   "+rate +"   "+date);
    }
}
public class Main {
    public static void main(String[] args) {
        Account x = new Account (1122,20000,4.5,"2/2/2001");
        x.withdraw(2500);
        x.deposit(3000);
        x.getmonthrate();
        x.printall();
    }
}