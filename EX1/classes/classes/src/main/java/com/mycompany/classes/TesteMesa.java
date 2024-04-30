/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;


/**
 *
 * @author Noite
 */
public class TesteMesa {

    private static Endereco Endereco;
    
    public static void main(String[] args) {
        // Criar uma pessoa
        Pessoa pessoa = new Pessoa("Nicolas", 30, Endereco);
        System.out.println("Pessoa: " + pessoa);

        // Criar uma conta bancária
        ContaBancaria conta1 = new ContaBancaria("Maria", 1000);
        System.out.println("Conta Bancaria: " + conta1);

        // Depositar e sacar dinheiro da conta bancária
        conta1.depositar(500);
        System.out.println("Deposito de 500 realizado. Saldo: " + conta1.getSaldo());
        conta1.sacar(200);
        System.out.println("Saque de 200 realizado. Saldo: " + conta1.getSaldo());

        // Realizar operações matemáticas
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(5, 3);
        int subtracao = calculadora.subtrair(10, 4);
        int multiplicacao = calculadora.multiplicar(6, 7);
        double divisao = calculadora.dividir(20, 4);

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
    }
}

