import java.util.Scanner;

public class Sexto {
    public static String periodo;
    public static int Conversao (int hrs){
        if (hrs > 12){
            hrs = hrs - 12;
            periodo = "PM";
            return hrs;
        }
        else{
            periodo = "AM";
            return hrs;
        }
    }

    public static void saida(int min, int hr){
        System.out.println(hr + " Horas: " + min + " Minutos: " + periodo);
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a hora que você deseja converter: ");
    int hora = sc.nextInt();
    
    System.out.println("Digite os minutos: ");
    int Minuto = sc.nextInt();

    int horaConvertida = Conversao(hora);

    System.out.println("Hora convertida: ");
    saida(Minuto, horaConvertida);

    sc.close();
}

}
