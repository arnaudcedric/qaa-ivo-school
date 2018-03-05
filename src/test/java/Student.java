public class Student {
//    int rollno;
//    String name;
//    String college = "ITS";
//
//     void change(){
//        college = "BBDIT";
//    }
//
//    Student(int r, String n){
//        rollno = r;
//        name = n;
//    }
//
//    void display (){System.out.println(rollno+" "+name+" "+college);}
//
//    public static void main(String args[]){
//        Student s0 = new Student (111,"Karan");
//        s0.change();
//
//        Student s1 = new Student (111,"Karan");
//        Student s2 = new Student (222,"Aryan");
//        Student s3 = new Student (333,"Sonoo");
//
//        s1.display();
//        s2.display();
//        s3.display();
//    }

    int rollno;
    String name;
    String college ="ITS";

    Student(int r,String n){
        rollno = r;
        name = n;
    }
    void display (){System.out.println(rollno+" "+name+" "+college);}

    public static void main(String args[]){
        Student s1 = new Student(111,"Karan");
        Student s2 = new Student(222,"Aryan");

        s1.display();
        s2.display();
    }

}
