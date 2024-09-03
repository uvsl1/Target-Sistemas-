import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> fibonacci = new ArrayList<>();

        int firstnum = 0;
        int secondnum = 1;

        System.out.print("Digite qual numero deseja verificar se é da sequência de Fibonacci: ");
        int num = sc.nextInt();

        fibonacci.add(firstnum);
        fibonacci.add(secondnum);

        while (secondnum < num) {
            int sum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = sum;
            fibonacci.add(secondnum);
        }

        if (fibonacci.contains(num)) {
            System.out.println(num + " está na sequência de Fibonacci.");
        } else {
            System.out.println(num + " não está na sequência de Fibonacci.");
        }

        /*System.out.println("Sequência de Fibonacci gerada:");
        for (int value : fibonacci) {
            System.out.println(value);
        }*/

        sc.close();
    }
}
