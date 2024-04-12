public class OutroJogo {
    public static void main(String[] args) {
        Personagem cacador = new Personagem();
        cacador.nome = "Jow";
        System.out.println(cacador.nome + " tem " + cacador.energia + " de energia e " + cacador.fome + " de fome");
        cacador.cacar();
        System.out.println(cacador.nome + " tem " + cacador.energia + " de energia e " + cacador.fome + " de fome");
        cacador.cacar();
        System.out.println(cacador.nome + " tem " + cacador.energia + " de energia e " + cacador.fome + " de fome");
        cacador.comer();
        System.out.println(cacador.nome + " tem " + cacador.energia + " de energia e " + cacador.fome + " de fome");
        cacador.energia = 10;
        cacador.comer();
        System.out.println(cacador.nome + " tem " + cacador.energia + " de energia e " + cacador.fome + " de fome");
    }
}
