import java.util.*;
import java.util.stream.Collectors;
class ToggleCase {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
StringBuilder sb = new StringBuilder();
for (char c : str.toCharArray()) sb.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
System.out.println("Toggled case string: " + sb);
}
}
