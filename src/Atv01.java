import java.util.Scanner;

public class Atv01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double primeiraNota;
        double segundaNota;

        System.out.print("Digite a primeira nota: ");
        primeiraNota = leitor.nextFloat();
        System.out.print("Digite a segunda nota: ");
        segundaNota = leitor.nextFloat();

        double media = (primeiraNota + segundaNota) / 2;

        if (media >= 6) {
            System.out.println(media+" meus parabéns!!");
        } else {
            System.out.println(media+" você não passou. Estude um pouco mais!");
        }
    }
}