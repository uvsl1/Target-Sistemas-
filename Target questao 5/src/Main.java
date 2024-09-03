import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string para ser invertida: ");
        String word = sc.nextLine();
        String invertedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            invertedWord += word.charAt(i);
        }

        System.out.println("Palavra invertida: " + invertedWord);

        sc.close();
    }
}
