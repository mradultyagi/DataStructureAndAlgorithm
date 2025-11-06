package access;

public class A {
//    agar num ke aage se private hta de aur kuch na like toh sirf isi pkg mai access kr sakte hai
//    called default public ho toh khi bhi access

    private int num;
    String name;
    int [] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr= new int [num];
    }
}
