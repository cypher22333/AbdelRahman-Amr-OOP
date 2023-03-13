public class student extends person {
       String stats;

        public student (String Stats){
            super();
            stats=Stats;
        }
    public String printall() {
        System.out.println("Student");

        return toString();
    }
}

