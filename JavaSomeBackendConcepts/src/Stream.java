import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class student{
    int roll;
    int marks;
    String name;

    public student(int r,int m,String n){
        this.marks=m;
        this.roll=r;
        this.name=n;
    }
    int getRoll() {return roll;}
    int getMarks(){return marks;}
    String getName(){return name;}
    public String toString() {
        return "{" + roll + ", " + marks + ", " + name + "}";
    }
}

public class Stream {
    static void main(String[] args) {
        int [] arr = {10,20,30};
        int max = Arrays.stream(arr)
                .max()
                .getAsInt();
        int sum = Arrays.stream(arr)
                .sum();
        double avg= Arrays.stream(arr)
                .average()
                .getAsDouble();
        System.out.println(max);
        System.out.println(sum);
        System.out.println(avg);

        java.util.stream.Stream.iterate(1, x->x+1)
                .filter(x -> x.toString().contains("5"))
                .limit(10)
                .forEach(System.out:: println);


        String str[] = {"abc","def","adv","agfdc"};
        Arrays.stream(str)
                .filter(x ->x.startsWith("a"))
                .filter(x->x.endsWith("c"))
                .sorted()
                .forEach(System.out::println);

        //collect keyword
        student arr2[] = {
                new student(110,70,"abc"),
                new student(120,80,"1sd"),
                new student(112,88,"ghi")
        };
        Map<Integer,String> m = Arrays.stream(arr2)
                .collect(Collectors.toMap(
                        student :: getRoll,
                        student ::getName
                ));
        //Group by marks
        Map<Integer, List<student>> m2 = Arrays.stream(arr2)
                .collect(Collectors.groupingBy(student::getMarks));
        m2.forEach((k, v) -> System.out.println(k + " -> " + v));

    }

}

