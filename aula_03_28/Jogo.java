import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) {
        Personagem cacador = new Personagem();
        System.out.println("nome: " + cacador.nome);
        System.out.println("sono: " + cacador.sono);
        cacador.sono = 10;
        String nome = JOptionPane.showInputDialog("escolha um nome para o cacador");
        cacador.nome = nome;
        System.out.println("nome: " + cacador.nome);
        System.out.println("sono: " + cacador.sono);
        Personagem pescador = new Personagem();
        pescador.nome = JOptionPane.showInputDialog("escolha um nome para o pescador");
       System.out.println("nome do pescador que voce escolheu: " + pescador.nome);
       pescador.sono = 5;
    }
}
