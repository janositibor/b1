package stringmanipulation;

public class StringManipulation {
    public String everyEvenCharacter(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
