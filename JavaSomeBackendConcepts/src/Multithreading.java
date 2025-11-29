public class Multithreading {
    public static void main(String[] args) {
        Thread t = new Thread(new Test());
        t.start();
        System.out.println("int main thread");
    }
    static class Test implements Runnable{
        public void run(){
            System.out.println("in test thread");
        }
    }
}
