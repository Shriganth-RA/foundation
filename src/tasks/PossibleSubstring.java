package tasks;

public class PossibleSubstring {
    static void main() {

        String s = "abssbci";

//        for (int i = 0; i < s.length(); i++) {
//            String result = "";
//            for (int j = 0; j < i + 1; j++) {
//                result += s.charAt(j);
//            }
//            System.out.println(result);
//        }

        String longest = "";

        for (int k = 0; k < s.length(); k++) {
            for (int i = k; i < s.length(); i++) {
                String result = "";
                for (int j = k; j < i + 1; j++) {
                    result += s.charAt(j);
                }
                System.out.println(result);

//                if (longest.length() < result.length()) {
//                    longest = result;
//                }
            }
        }

        System.out.println(longest);
    }
}
