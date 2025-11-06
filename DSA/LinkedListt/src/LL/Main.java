package LL;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(5);
//        list.insertFirst(52);
//        list.insertFirst(52);
//        list.insertFirst(51);
//        list.insertFirst(53);
//        list.insert(9,4);
//        System.out.println(list.deletefirst());
//
//        list.display();
//        System.out.println(list.deletelast());
//        list.display();
//        System.out.println(list.delete(3));
//        list.display();
      CLL list = new CLL();
      list.insert(23);
      list.insert(2);
      list.insert(3);
      list.insert(4);
      list.insert(5);
      list.insert(12);
      list.display();
      list.delete(4);
      list.display();
      list.delete(12);
      list.display();





    }
}
