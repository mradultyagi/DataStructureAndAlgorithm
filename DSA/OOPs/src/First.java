
public class First {
    public static void main(String[] args) {
//        int[] rno=new int[5];
//        String[] name=new String[5];
//        float[] marks=new float[5];
//        Student [] students = new Student[5];


        //instance of a student

        Student mradul = new Student(15,"Mradul tyagi",66.7f);
        Student vinay = new Student(16,"vinay",90.3f);
        Student abdul = new Student();
        Student random = new Student(mradul);
        System.out.println(random.name);
        System.out.println(abdul.name);

//        System.out.println(Arrays.toString(students));
        System.out.println(mradul.rno) ;
        System.out.println(mradul.name) ;
        System.out.println(mradul.marks) ;

        System.out.println(vinay.rno);
        System.out.println(vinay.marks);
        System.out.println(vinay.name);

        mradul.greetings();


    }
    static class Student{
        int rno;
        String name;
        float marks;

        void greetings(){
            System.out.println("hello my name is "+ this.name);
        }

        Student(Student other){
            this.rno=other.rno;
            this.name = other.name;
            this.marks= other.marks;
        }

        Student(){
            this.rno=110;
            this.name = "tyagi";
            this.marks=87.5f;
        }

        Student(int rno,String name, float marks){
            this.rno=rno;
            this.name = name;
            this.marks=marks;
        }
    }
}


