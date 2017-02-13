// Palindrome2.java
public class Palindrome2 {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1)
        // Please write your code here
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1))
        // Please write your code here
            return false;
        else
            return isPalindrome(s.substring(1, s.length() - 1));
    }


    public static void main(String[] args) {
        ListString head = ListString.FileRead();
        while (head != null) {
            if (isPalindrome(head.name)) {
                System.out.println(head.name);
            }
            head = head.next;
        }
    }
}
