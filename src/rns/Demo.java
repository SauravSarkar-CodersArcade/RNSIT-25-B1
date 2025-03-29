package rns;
// Wrapper Class
public class Demo {
    public static void main(String[] args) {
        char[] letters = {'B','H','A','R','A','D','W','A','J'};
        String name = new String(letters);
        System.out.println(name);
        String message = "Gourav1is1a1student1of1RNSIT";
        // Gourav, is, a, student, of, RNSIT
        String[] words = message.split("1");
        System.out.println(words[0]);
        String str = "  Gourav  ";
        System.out.println(str.trim());
    }
}
