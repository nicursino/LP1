public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fracao soma(Fracao outraFracao) {
        int novoNumerador = this.numerador * outraFracao.denominador + outraFracao.numerador * this.denominador;
        int novoDenominador = this.denominador * outraFracao.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao subtracao(Fracao outraFracao) {
        int novoNumerador = this.numerador * outraFracao.denominador - outraFracao.numerador * this.denominador;
        int novoDenominador = this.denominador * outraFracao.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao multiplicacao(Fracao outraFracao) {
        int novoNumerador = this.numerador * outraFracao.numerador;
        int novoDenominador = this.denominador * outraFracao.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao divisao(Fracao outraFracao) {
        int novoNumerador = this.numerador * outraFracao.denominador;
        int novoDenominador = this.denominador * outraFracao.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    // Exemplo de uso
    public static void main(String[] args) {
        Fracao frac1 = new Fracao(1, 2);
        Fracao frac2 = new Fracao(3, 4);

        System.out.println("Fração 1: " + frac1);
        System.out.println("Fração 2: " + frac2);
        System.out.println("Soma: " + frac1.soma(frac2));
        System.out.println("Subtração: " + frac1.subtracao(frac2));
        System.out.println("Multiplicação: " + frac1.multiplicacao(frac2));
        System.out.println("Divisão: " + frac1.divisao(frac2));
    }
}

