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
    public static void main(String[] args) {
        // Criar uma pessoa
        Pessoa pessoa1 = new Pessoa("João", 30);
        System.out.println("Pessoa: " + pessoa1);

        // Criar uma conta bancária
        ContaBancaria conta1 = new ContaBancaria("Maria", 1000);
        System.out.println("Conta Bancária: " + conta1);

        // Depositar e sacar dinheiro da conta bancária
        conta1.depositar(500);
        System.out.println("Depósito de 500 realizado. Saldo: " + conta1.getSaldo());
        conta1.sacar(200);
        System.out.println("Saque de 200 realizado. Saldo: " + conta1.getSaldo());

        // Realizar operações matemáticas
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(5, 3);
        int subtracao = calculadora.subtrair(10, 4);
        int multiplicacao = calculadora.multiplicar(6, 7);
        double divisao = calculadora.dividir(20, 4);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}

