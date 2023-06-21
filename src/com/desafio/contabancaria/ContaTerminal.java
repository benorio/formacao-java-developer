package com.desafio.contabancaria;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		int numero;
		String agencia, nomeCliente,sobreNomeCliente;
		double saldo = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da agência");
		numero = sc.nextInt();
		
		System.out.println("Por favor, digite o nome da agência");
		agencia = sc.next();
		
		System.out.println("Por favor, digite seu saldo");
		saldo = sc.nextDouble();
		
		System.out.println("Por favor, digite o nome do cliente");
		nomeCliente = sc.next();
		
		System.out.println("Por favor, digite o sobrenome do cliente");
		sobreNomeCliente = sc.next();
		
		
		sc.close();
		
		System.out.println("Olá " + nomeCliente + " " +sobreNomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ""
				+ "e seu saldo " + saldo +  " já está disponível para saque");
		
		
	}

}
