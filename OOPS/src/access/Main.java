package access;

public class Main {
    public static void main(String[] args) {
        A a = new A(10,"Mradul");
        a.getNum();//getnum public hai toh usse khi se bhi access kr sakte hai pr num variable jo hai sirf hum A mai hi
//        accesss kr sakte hai kyuki vo private hai toh usse yaha access krne k liye humne getnum ise kiya
    }
}
