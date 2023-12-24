package TwoPointers;

public class ValidPalindrom {
    public boolean isPalindrome(String s) {
        String t = "";
        for (int j = s.length() - 1; j >= 0; j--) {
                t += s.charAt(j);
        }
        if (s.toLowerCase().equals(t.toLowerCase())) {
            return true;
        }
        return false;

    }
}
