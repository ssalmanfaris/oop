class students {

    //Attributes
    int ID;
    String Name;
    String email;
    int Phnnumber;

    //Constructor
    //Syntax of constructors = Class Name + () + {}

    students(int ID, String Name, String email, int Phnnumber) {
        this.ID = ID;
        this.Name = Name;
        this.email = email;
        this.Phnnumber = Phnnumber;
    }

    //method
    //Syntax of method= return type + Method Name + () + {}

    //study
    //read
    //write

    void study() {
        System.out.println("student can study");
    }

    void read() {
        System.out.println("student can read");
    }

    void write() {
        System.out.println("student can write");
    }

    void Info() {
        System.out.println(ID);
        System.out.println(Name);
        System.out.println(email);
        System.out.println(Phnnumber);
    }
}

