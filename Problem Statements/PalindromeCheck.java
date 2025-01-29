import java.util.*;
import java.util.stream.Collectors;
class PalindromeCheck {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
String rev = new StringBuilder(str).reverse().toString();
System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
}
}
