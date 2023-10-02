import java.util.Scanner;

public class Atv02Repet {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String senha;

        do {
            System.out.print("Digite a senha: ");
            senha = leitor.nextLine();

            if (!senha.equals("123")) {
                System.out.println("Senha incorreta!");
            }
        } while (!senha.equals("123"));

        System.out.println("Senha correta!");
    }
}