public class person {

        public String name;
        public String address;
        public int phone;
        public String email;
        public person (String Name,String Address,int Phone, String Email) {
            name=Name;
            address=Address;
            phone=Phone;
            email=Email;
        }

    public person() {

    }

    public String printall() {
        System.out.println("Person");

        return toString();
        }
    }

