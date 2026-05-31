import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args) {

        Scanner ls = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = ls.nextInt();

        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

        ls.close();
    }
}