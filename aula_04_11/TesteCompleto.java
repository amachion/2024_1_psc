import java.util.Scanner;

public class TesteCompleto {
    public static void main(String[] args) {
        Arma arma1;
        Personagem p1;
        String nome;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite o nome da arma: ");
        nome = scanner.nextLine();
        arma1 = new Arma(nome);
        System.out.println("minha arma:\n " + arma1);

        System.out.println ("digite o nome do personagem: ");
        nome = scanner.nextLine();
        p1 = new Personagem(nome, 2, 5, 9, arma1);
        System.out.println("meu personagem:\n " + p1);

        System.out.println("\nnome do personagem: " + p1.getNome());
        System.out.println("nome da arma: " + p1.getArma().getNome());

        System.out.println("digite o nome da outra arma: ");
        nome = scanner.nextLine();
        Arma arma2 = new Arma(nome);

        System.out.println("Digite o nome do personagem 2: ");
        nome = scanner.nextLine();
        Personagem p2 = new Personagem(nome, arma2);
        System.out.println("\nnovo personagem:\n" + p2);

        Arma a3 = new Arma();
        System.out.println("arma zerada:\n" + a3);
        Personagem p3 = new Personagem();
        System.out.println("personagem zerado:\n" + p3);

        scanner.close();
    }
}
