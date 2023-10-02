import java.util.Scanner;
import java.util.Date;

public class Atv05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = leitor.nextInt();
        int anoAtual = new Date().getYear() + 1900;
        int idade = anoAtual - anoNascimento;
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}