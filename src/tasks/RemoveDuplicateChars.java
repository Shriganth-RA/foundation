package tasks;

public class RemoveDuplicateChars {
    static void main() {
        String word = "Programming";
        String result = "";

        for (int i = 0; i < word.length(); i++)  {
            char ch = word.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
