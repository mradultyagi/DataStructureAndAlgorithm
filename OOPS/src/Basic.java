//package introduction;

public class Basic {
    public static void main(String[] args) {
        Student[] students= new Student[5];
        Student student1= new Student(1,"Mradul tyagi",87.9f);
        System.out.println(student1.name);
        Student student2 = new Student();
        System.out.println(student2);

        Student random = new Student(student1);



    }

}
class Student{
    int rno ;
    String name;
    float marks;
    //MAIN CONSTRUCTOR
    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    Student(){
        this.rno=100;
        this.name="blank";
        this.marks=0.0f;
    }
    //    constructor k and constructor pass
    Student(Student other) {
        //this ki zaght random and other ki zaght student1 LINE NUMBER 11
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
}

