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

    public Roupas(String marca, String modelo) {
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

// Classe Lojas
class Lojas {
    private String local;
    private String tipo;

    public Lojas(String marca, String modelo) {
        this.local = local;
        this. = cor;
    }

    public void comprar(){
        System.out.println("A roupa da cor " + cor + " " + tamanho + "." );
    }

    public void devolver(){
        System.out.println("vim devolver a roupda da " + cor + " " + tamanho + "." );
    }
}

// Classe TestaClasse
public class TestaClasse {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        Carro carro = new Carro("Toyota", "Corolla");
        Roupas roupas = new Roupas("preto", "GG");

        // Chamando métodos da classe Pessoa
        pessoa.apresentar();
        pessoa.fazerAniversario();

        // Chamando métodos da classe Carro
        carro.ligar();
        carro.acelerar();

        // Chamando métodos da classe Roupas
        roupas.comprar();
        roupas.devolver();


    }
}

