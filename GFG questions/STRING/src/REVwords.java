public class REVwords {
    public static void main(String[] args) {
        String str = "hello world";
        // output: "world hello"
        System.out.println(rev(str));
    }

    static String rev(String s) {
        int n = s.length();

        // Step 1: reverse whole string
        s = reverse(s, 0, n - 1);

        String ans = "";
        int i = 0;

        // Step 2: reverse each word
        while (i < n) {
            // skip spaces
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }

            String word = "";
            while (i < n && s.charAt(i) != ' ') {
                word += s.charAt(i);
                i++;
            }

            if (!word.isEmpty()) {
                word = reverse(word, 0, word.length() - 1);
                if (ans.isEmpty()) {
                    ans = word;
                } else {
                    ans += " " + word;
                }
            }
        }
        return ans;
    }

    // Helper function: reverse substring
    static String reverse(String str, int start, int end) {
        String ans = "";
        for (int i = end; i >= start; i--) {
            ans += str.charAt(i);
        }
        return ans;
    }
}
