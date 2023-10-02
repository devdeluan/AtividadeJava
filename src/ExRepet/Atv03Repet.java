import java.util.Scanner;

public class Atv03Repet {
    public static void main(String[] args) {
        String numero;
        do {
            Scanner leitor = new Scanner(System.in);
            System.out.print("Digite um numero: ");
            numero = leitor.nextLine();
        } while (!numero.equals("0"));
    }
}
