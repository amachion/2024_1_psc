import javax.swing.JOptionPane;

public class JogoComMenu {
    public static void main(String[] args) {
        int opcao;

        opcao = Integer.parseInt(
            JOptionPane.showInputDialog("Escolha:\n1 - criar heroi\n2 - criar vilao\n0 - sair")
        ); 
        switch (opcao) {
            case 1: {
                String nome = JOptionPane.showInputDialog("Qual o nome do heroi");
                int energia = Integer.parseInt(
                    JOptionPane.showInputDialog("qual o nivel de energia? (escolha um valor de 0 a 10)")
                );
                int fome = Integer.parseInt(
                    JOptionPane.showInputDialog("qual o nivel de fome? (escolha um valor de 0 a 10)")
                );
                int sono = Integer.parseInt (
                    JOptionPane.showInputDialog("qual o nivel de sono? (escolha um valor de 0 a 10)")
                );
                Personagem heroi = new Personagem(nome, energia, fome, sono);
                JOptionPane.showMessageDialog(null, "meu heroi: " + heroi.getNome() + "\nenergia: " + heroi.getEnergia() + "\nfome: " + heroi.getFome() + "\nsono: " + heroi.getSono() + "\n", "Saída", 0);
                break;
            }
            case 2: {
                String nome = JOptionPane.showInputDialog("Qual o nome do vilao");
                int energia = Integer.parseInt(
                    JOptionPane.showInputDialog("qual o nivel de energia? (escolha um valor de 0 a 10)")
                );
                int fome = Integer.parseInt(
                    JOptionPane.showInputDialog("qual o nivel de fome? (escolha um valor de 0 a 10)")
                );
                int sono = Integer.parseInt (
                    JOptionPane.showInputDialog("qual o nivel de sono? (escolha um valor de 0 a 10)")
                );
                Personagem vilao = new Personagem(nome, energia, fome, sono);
                JOptionPane.showMessageDialog(null, "o vilao: " + vilao.getNome() + "\nenergia: " + vilao.getEnergia() + "\nfome: " + vilao.getFome() + "\nsono: " + vilao.getSono() + "\n", "Saída", 0);
                break;
            }
            default:
                JOptionPane.showMessageDialog(null, "obrigado, volte sempre", "tchau", 0);
                break;
        }
    }
}
