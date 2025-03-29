package rns.oops;
public class Student {
    {
        System.out.println("IIB-1");
    }
    String name;
    int rollNo;
    String dept;
    static final String college;
    Student(String name, int rollNo, String dept){
        this.name = name;
        this.rollNo = rollNo;
        this.dept = dept;
    }
    void studentDetails(){
        System.out.println("Name: " + this.name); // this -> current object
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Department: " + this.dept);
        System.out.println("College: " + college);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Sahana", 100,
                "CSE");
        s1.studentDetails();

        Student s2 = new Student("Ramya", 101,
                "CSE");

        s2.studentDetails();
    }
    static {
        college = "RNSIT";
        System.out.println("Execution Starts");
    }
    {
        System.out.println("IIB-2");
    }
}
