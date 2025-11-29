
public class SearchInsertDelete {
    static class TrieNode {
        TrieNode[] child = new TrieNode[26];
        boolean isEnd;
    }

    static TrieNode root = new TrieNode();

    static boolean search(String key) {
        TrieNode curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.child[index] == null)
                return false;
            curr = curr.child[index];
        }
        return curr.isEnd;
    }

    static void insert(String key) {
        TrieNode curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (curr.child[index] == null)
                curr.child[index] = new TrieNode();
            curr = curr.child[index];
        }
        curr.isEnd = true;
    }
    static void printTrie(TrieNode root, StringBuilder prefix) {
        if (root == null) return;

        // If current node marks end of a word, print it
        if (root.isEnd) {
            System.out.println(prefix.toString());
        }

        // Explore all possible children
        for (int i = 0; i < 26; i++) {
            if (root.child[i] != null) {
                prefix.append((char)(i + 'a'));
                printTrie(root.child[i], prefix);
                prefix.deleteCharAt(prefix.length() - 1); // Backtrack
            }
        }
    }


    public static void main(String[] args) {
        insert("apple");
        insert("app");
        insert("zoo");
        insert("geek");
        insert("geeks");
        insert("bat");
         delete(root,"apple",0);
        printTrie(root,new StringBuilder());

        System.out.println(search("appl"));

    }
    static boolean isEmpty(TrieNode root){
        for (int i = 0; i < 26; i++) {
            if(root.child[i]!=null){
                return false;
            }
        }
        return true;
    }
    static TrieNode delete(TrieNode root, String key,int i){
        if(root==null) return null;
        if(i==key.length()){
            root.isEnd=false;
            if(isEmpty(root)==true)
                return null;
            return root;
        }
        int index = key.charAt(i)-'a';
        root.child[index]=delete(root.child[index],key,i+1);
        if(isEmpty(root) && root.isEnd ==false){
            return null;
        }
        return root;

    }
}
