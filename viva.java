import java.util.HashSet;

public class viva {
    public static void getString() {
        String str = "abhay";
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
            }
        }

        for (Character character : set) {
            System.out.print(character);
        }
    }

    public static void main(String[] args) {
        getString();
    }
}
