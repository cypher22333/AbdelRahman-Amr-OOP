public class Employee extends person{
    public double salary;
    public String office;
    public String date;
    public Employee(double Salary, String Office, String Date){
        super();
        salary=Salary;
        office=Office;
        date=Date;
    }
    public String printall() {
        System.out.println("Employee");
        return toString();
    }
}
