package access;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    //unique no to a object
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(10);
        ObjectDemo obj2 = new ObjectDemo(22);
        if(obj.equals(obj2) ){
            System.out.println("smaller");
        }
        System.out.println(obj.hashCode());
    }
}
