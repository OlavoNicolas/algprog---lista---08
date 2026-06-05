import java.util.Scanner;

public class Quinto {
    public static double somaimposto(double taxaImposto, double custo){
        taxaImposto = (taxaImposto/100) + 1;
        return (custo * taxaImposto);
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o custo do produto sem imposto: ");
    double custoProduto = sc.nextDouble();
    
    System.out.println("Digite a quantidade de imposto paga em %: ");
    double imposto = sc.nextDouble();

    double precoFinal = somaimposto(imposto, custoProduto);

    System.out.println("Custo final é de: " + precoFinal);

    sc.close();
}
}
