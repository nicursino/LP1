// Classe Pessoa
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    public void fazerAniversario() {
        idade++;
        System.out.println("Feliz aniversário! Agora tenho " + idade + " anos.");
    }
}

// Classe Carro
class Carro {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void ligar() {
        System.out.println("O carro " + marca + " " + modelo + " está ligado.");
    }

    public void acelerar() {
        System.out.println("Acelerando o carro " + marca + " " + modelo + ".");
    }
}

// Classe Roupas
class Roupas {
    private String tamanho;
    private String cor;

    public Roupas(String tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public void comprar(){
        System.out.println("A roupa da cor " + cor + " " + tamanho + "." );
    }

    public void devolver(){
        System.out.println("vim devolver a roupda da " + cor + " " + tamanho + "." );
    }
}

class Celular {
    private String marca;
    private String cor;

    public Celular(String marca, String cor){
        this.marca = marca;
        this.cor = cor;
    }

    public void ligar() {System.out.println("vou comprar um celular pra você da cor " + cor + "e da " + marca );}

    public void conversar() {System.out.println("essa " + marca + "com essa " + cor + "é muito podre");}
}

class Corpo_humano {
    private int idade;
    private int altura;

    public Corpo_humano (int idade, int altura){
        this.idade = idade;
        this.altura = altura;
    }

    public void falar(){System.out.println("ele tem " + idade + "anos e " + altura + "m");}
    public void ouvir(){System.out.println("ele é muito velho tem " + idade + "e muito baixo só tem " + altura + "m");}
}


// Classe TestaClasse
public class TestaClasse {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        Carro carro = new Carro("Toyota", "Corolla");
        Roupas roupas = new Roupas("preto", "GG");
        Celular celular = new Celular("iphone", "branco");
        Corpo_humano corpo_humano = new Corpo_humano(89, 145);

        // Chamando métodos da classe Pessoa
        pessoa.apresentar();
        pessoa.fazerAniversario();

        // Chamando métodos da classe Carro
        carro.ligar();
        carro.acelerar();

        // Chamando métodos da classe Roupas
        roupas.comprar();
        roupas.devolver();

        // Chamando métodos da classe Celular
        celular.ligar();
        celular.conversar();

        // Chamando métodos da classe Corpo_humano
        corpo_humano.falar();
        corpo_humano.ouvir();



    }
}

