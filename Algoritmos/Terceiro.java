import java.util.Scanner;

public class Terceiro {
    
    public static int soma (int a, int b, int c){
        return a + b + c;
    }

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro numero: ");
    int n1 = sc.nextInt();
    
    System.out.println("Digite o segundo numero: ");
    int n2 = sc.nextInt();

    System.out.println("Digite o terceiro numero: ");
    int n3 = sc.nextInt();

    int somar = soma(n1, n2, n3);

    System.out.println("A soma dos números é igual: " + somar);
    
    
    sc.close();
    
    }
}
