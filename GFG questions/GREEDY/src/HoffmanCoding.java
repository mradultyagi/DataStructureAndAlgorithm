import java.util.PriorityQueue;

public class HoffmanCoding {
    static class Node{
        char ch;
        int freq;
        Node left;
        Node right;

        public Node(char ch, int freq, Node left, Node right) {
            this.ch = ch;
            this.freq = freq;
            this.left = left;
            this.right = right;
        }
    }

    static void printHcode(int[] freq,char[] arr){
        PriorityQueue<Node> h = new PriorityQueue<>((n1,n2) -> n1.freq-n2.freq);
        for (int i = 0; i < arr.length; i++) {
            h.add(new Node(arr[i],freq[i],null,null));
        }
        while (h.size()>1){
            Node l = h.poll();
            Node r = h.poll();
            h.add(new Node('$',l.freq+r.freq,l,r));
        }
        printRec(h.peek()," ");

    }
    static void printRec(Node root , String str){
        if(root.ch !='$'){
            System.out.println(root.ch+" "+str);
            return;
        }
        printRec(root.left,str+"0");
        printRec(root.right,str+'1');
    }
}
