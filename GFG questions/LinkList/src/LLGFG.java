import java.util.ArrayList;
import java.util.HashSet;

public class LLGFG {

    // Node for flattening (has next -> next list, bottom -> within-list)
    public static class Node2 {
        int data;
        Node2 next;
        Node2 bottom;

        Node2(int data) {
            this.data = data;
            this.next = null;
            this.bottom = null;
        }
    }

    // Doubly linked list node (used by many other methods)
    public static class Node {
        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    // print forward for DLL
    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LLGFG obj = new LLGFG();

        // test rotateByP on DLL
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.prev = head.next.next.next.next;

        System.out.println("Original DLL:");
        obj.print(head);
        head = obj.rotateByP(head, 2);
        System.out.println("After rotateByP(2):");
        obj.print(head);

        // Example for flatten (optional demo)
        Node2 r = new Node2(5);
        r.bottom = new Node2(7);
        r.bottom.bottom = new Node2(8);
        r.bottom.bottom.bottom = new Node2(30);

        r.next = new Node2(10);
        r.next.bottom = new Node2(20);

        r.next.next = new Node2(19);
        r.next.next.bottom = new Node2(22);
        r.next.next.bottom.bottom = new Node2(50);

        r.next.next.next = new Node2(28);
        r.next.next.next.bottom = new Node2(35);
        r.next.next.next.bottom.bottom = new Node2(40);
        r.next.next.next.bottom.bottom.bottom = new Node2(45);

        Node2 flat = flatteer(r);
        System.out.print("Flattened list: ");
        while (flat != null) {
            System.out.print(flat.data + " ");
            flat = flat.bottom;
        }
        System.out.println();
    }

    // ---------- Utilities and problems ----------

    // Singly linked list reverse (returns new head)
    static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // length of DLL (or singly via next)
    public int len(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    // reverse in groups of k (singly list via next). Returns new head.
    public Node reverseK(Node head, int k) {
        if (head == null || k <= 1) return head;
        int n = len(head);
        int groups = n / k;
        Node prevTail = null;
        Node currHead = head;
        Node newHead = null;

        for (int i = 0; i < groups; i++) {
            Node prev = null;
            Node curr = currHead;
            Node next = null;
            // reverse k nodes
            for (int j = 0; j < k && curr != null; j++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            // prev is new head of reversed group
            if (newHead == null) newHead = prev;
            if (prevTail != null) prevTail.next = prev;

            // prevTail becomes the tail of this reversed group which was currHead
            prevTail = currHead;
            // next group's head
            currHead = curr;
        }

        // attach remaining nodes (if any)
        if (prevTail != null) prevTail.next = currHead;
        return newHead == null ? head : newHead;
    }

    // find start of a cycle using HashSet approach (returns data or -1)
    static int cycleStrt(Node head) {
        HashSet<Node> set = new HashSet<>();
        Node currNode = head;
        while (currNode != null) {
            if (set.contains(currNode)) {
                return currNode.data;
            }
            set.add(currNode);
            currNode = currNode.next;
        }
        return -1;
    }

    // remove duplicates from unsorted singly linked list
    public Node removeDuplicates(Node head) {
        if (head == null) return null;
        HashSet<Integer> seen = new HashSet<>();
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            if (seen.contains(curr.data)) {
                // skip curr
                prev.next = curr.next;
            } else {
                seen.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }

    // find pairs with sum in a sorted doubly linked list (returns list of int[] pairs)
    public ArrayList<int[]> findPairsWithSum(Node head, int x) {
        ArrayList<int[]> result = new ArrayList<>();
        if (head == null) return result;

        Node left = head;
        Node right = head;
        while (right.next != null) right = right.next;

        while (left != null && right != null && left != right && right.next != left) {
            int sum = left.data + right.data;
            if (sum == x) {
                result.add(new int[]{left.data, right.data});
                left = left.next;
                right = right.prev;
            } else if (sum < x) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }
        return result;
    }

    // rotate a DLL by p positions (left rotation by p)
    public Node rotateByP(Node head, int p) {
        if (head == null || p == 0) return head;
        Node curr = head;
        int count = 1;
        while (count < p && curr != null) {
            curr = curr.next;
            count++;
        }
        if (curr == null) return head; // p > length

        Node newHead = curr.next;
        if (newHead == null) return head; // rotating by length or last node

        newHead.prev = null;
        curr.next = null;

        // find tail of new list
        Node tail = newHead;
        while (tail.next != null) tail = tail.next;

        tail.next = head;
        head.prev = tail;

        return newHead;
    }

    // Reverse a doubly linked list and return new head
    public Node revDLL(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            curr.prev = next; // swap prev pointer to original next
            prev = curr;
            curr = next;
        }
        if (prev != null) prev.prev = null; // new head's prev must be null
        return prev;
    }

    // Rotate DLL in k-groups (reverse every k nodes in DLL)
    public Node KgroupDLL(Node head, int k) {
        if (head == null || k <= 1) return head;

        Node curr = head;
        Node newhead = null;
        Node prevEnd = null;

        while (curr != null) {
            int count = 0;
            Node grpstart = curr;
            Node temp = curr;
            while (count < k - 1 && temp.next != null) {
                temp = temp.next;
                count++;
            }
            Node nextStart = temp.next;
            // cut group
            temp.next = null;
            if (nextStart != null) nextStart.prev = null;

            // reverse this group (DLL reverse)
            Node revhead = revDLL(grpstart);

            if (newhead == null) newhead = revhead;
            if (prevEnd != null) {
                prevEnd.next = revhead;
                revhead.prev = prevEnd;
            }

            // prevEnd becomes original grpstart (which is now tail of reversed group)
            prevEnd = grpstart;

            // attach the remaining part
            grpstart.next = nextStart;
            if (nextStart != null) nextStart.prev = grpstart;

            curr = nextStart;
        }

        return newhead;
    }

    // ---------- Flattening a linked list (Node2) ----------

    // flatten recursively: merge via bottom pointers and remove next pointers
    public static Node2 flatteer(Node2 root) {
        if (root == null || root.next == null) return root;
        // flatten rest
        root.next = flatteer(root.next);
        // merge current and flattened next
        root = merge(root, root.next);
        return root;
    }

    // merge two sorted lists which use 'bottom' for next pointer in final list
    public static Node2 merge(Node2 a, Node2 b) {
        if (a == null) return b;
        if (b == null) return a;

        Node2 result;
        if (a.data < b.data) {
            result = a;
            result.bottom = merge(a.bottom, b); // go down a
        } else {
            result = b;
            result.bottom = merge(a, b.bottom); // go down b
        }
        result.next = null; // ensure 'next' pointers are cleared in flattened list
        return result;
    }

}
