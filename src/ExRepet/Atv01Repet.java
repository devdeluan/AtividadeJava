import java.util.ArrayList;

public class Atv01Repet {
    public static void main(String[] args) {
        ArrayList<String> professores = new ArrayList<>();
        professores.add("Alana");
        professores.add("Aléxia");
        professores.add("Jéssica");
        professores.add("Odirlei");
        professores.add("Possarle");
        professores.add("Samanta");
        professores.add("Thiago");

        for (int contador = 0; contador < professores.size(); contador++) {
            System.out.println("O índice atual é " + contador);
            if (contador == 0) {
                System.out.println("O número de indice do(a) professor(a) " + professores.get(contador) + " é Zero");
            } else if (contador % 2 == 0) {
                System.out.println("O número de indice do(a) professor(a) " + professores.get(contador) + " é Par");
            } else {
                System.out.println("O número de indice do(a) professor(a) " + professores.get(contador) + " é Impar");
            }
        }
    }
}