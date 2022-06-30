package com.java;

public class TesteConta {

	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();
		
		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.5;
		contaCorrente.cliente.nome = "Tisha";
		contaCorrente.cliente.idade = 45;
		
		contaPoupanca.numero = 22;
		contaPoupanca.saldo = 30;
		contaPoupanca.cliente.nome = "Sofia";
		contaPoupanca.cliente.idade = 12;
		
		contaInvestimento.numero = 34;
		contaInvestimento.saldo = 65000;
		contaInvestimento.cliente.nome = "Pedro Henrique";
		contaInvestimento.cliente.idade = 17;
		
		System.out.println("Numero da conta: " + contaInvestimento.numero);
		System.out.println("Saldo da conta: " + contaInvestimento.saldo);
		System.out.println("Cliente da conta: " + contaInvestimento.cliente.nome);
		System.out.println("Idade do cliente da conta: " + contaInvestimento.cliente.idade);
		
	}
}
