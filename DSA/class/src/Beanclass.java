import java.io.*;
public class Employee implements Serializable {
    private String name ;
    public void setName(String name ){
        this.name = name ;
}
    public String getName(){
        return name;
    }

    class Beanclass {
        public static void main(String[] args) {
            {
                Beanclass e = new Beanclass();
                e.setName("tyagi");
                String x=e.getName();
                System.out.println("name is " + x );

            }
        }
    }
}



