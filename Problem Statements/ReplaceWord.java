import java.util.*;
import java.util.stream.Collectors;
class ReplaceWord {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a sentence: ");
String sentence = sc.nextLine();
System.out.print("Enter word to replace: ");
String oldWord = sc.next();
System.out.print("Enter new word: ");
String newWord = sc.next();
System.out.println("Modified sentence: " + sentence.replace(oldWord, newWord));
}
}
