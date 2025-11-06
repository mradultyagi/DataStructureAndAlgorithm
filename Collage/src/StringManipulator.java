public class StringManipulator {

    public static String rearrangeString(String s) {
        if (s.length() <= 5) {
            return s; // Return the original string if its length is not greater than 5
        }

        StringBuilder mainPart = new StringBuilder();
        StringBuilder movedPart = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            // Positions are 1-based as per typical human-readable index
            int position = i +1;
            if (position % 4 == 0 || position % 6 == 0) {
                movedPart.append(s.charAt(i));
            } else {
                mainPart.append(s.charAt(i));
            }
        }

        return mainPart.toString() + movedPart.toString();
    }

    public static void main(String[] args) {
        String input = "abcdefghijklm"; // Example input
        String result = rearrangeString(input);
        System.out.println("Modified string: " + result);
    }
}
