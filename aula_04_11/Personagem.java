import java.util.Random;
public class Personagem {
    private String nome;
    private int energia;
    private int fome;
    private int sono;
    private Arma arma;
    public Personagem (String nome, int energia, int fome, int sono, Arma arma) { 
        setNome(nome);
        setEnergia(energia);
        setFome(fome);
        setSono(sono);
        setArma(arma);
    }
    public Personagem (String nome, Arma arma) {
        this.nome = nome;
        this.arma = arma;
        Random random = new Random();
        energia = random.nextInt(11);
        fome = random.nextInt(11);
        sono = random.nextInt(11);
    }
    public Personagem() {}
    public String getNome () {
        return this.nome;
    }
    public int getEnergia () {
        return energia;
    }
    public int getFome () {
        return fome;
    }
    public int getSono () {
        return sono;
    }
    public Arma getArma () {
        return arma;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setEnergia (int energia) {
        if (energia <= 0) {
            this.energia = 0;
        }
        else if (energia >= 10) {
            this.energia = 10;
        }
        else {
            this.energia = energia;
        }
    }
    public void setFome (int fome) {
        if (fome <= 0) {
            this.fome = 0;
        }
        else if (fome >= 10) {
            this.fome = 10;
        }
        else {
            this.fome = fome;
        }
    }
    public void setSono (int sono) {
        if (sono <= 0) {
            this.sono = 0;
        }
        else if (sono >= 10) {
            this.sono = 10;
        }
        else {
            this.sono = sono;
        }
    }
    public void setArma (Arma arma) {
        this.arma = arma;
    }
    void cacar () {
        if (energia >= 2) {
            System.out.println(nome + " cacando");
            energia = energia - 2;
            fome = Math.min(fome+1, 10);
            sono = Math.min(sono + 1, 10);
        }
        else {
            System.out.println(nome + " cansado...");
        }
    }
    void comer () {
        if (fome >= 1) {
            System.out.println(nome + " comendo");
            fome--;
            energia = Math.min(energia+1, 10);
        }
        else {
            System.out.println(nome + " sem fome");
        }
    }
    void dormir () {
        if (sono >=1) {
            System.out.println(nome + " zzzzzzzz");
            sono--;
            energia = Math.min(energia+1, 10);
        }
        else {
            System.out.println(nome + " sem sono");
        }
    }
    @Override
    public String toString () {
        return "nome: " + nome + "\nenergia: " + energia + 
        "\nfome: " + fome + "\nsono: " + sono + 
        "\nsua arma\n: " + arma; 
    }
}