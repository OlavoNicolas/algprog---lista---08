import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        
        Scanner ls = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = ls.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.print("1 ");
            for (int j = 1; j <= i; j++) {
                if(j>1){
                System.out.print(j + " ");
                }
            }
            System.out.println();
        }

        ls.close();

    }
}
