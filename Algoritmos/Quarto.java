import java.util.Scanner;

public class Quarto {
    public static String retorno(int x){
        if (x >= 1) {
          return "Positivo";  
        }else{
          return "Negativo";
        }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int a = sc.nextInt();

    String resultado = retorno(a);
    
    System.out.println(resultado);

    sc.close();
}
}
