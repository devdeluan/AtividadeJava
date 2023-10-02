import java.util.Scanner;

public class Atv02 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double numero;

        System.out.print("Digite um número: ");
        numero = leitor.nextFloat();

        if (numero > 0) {
            System.out.println("positivo");
        } else if (numero < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("neutro");
        }
    }
}