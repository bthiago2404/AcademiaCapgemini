package br.com.capgemini.main;

import java.util.List;
import java.util.Scanner;

import br.com.capgemini.services.Anagrama;
import br.com.capgemini.services.Escada;
import br.com.capgemini.services.Senha;

public class Menu {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// MENU
		while (true) {
			System.out.println("***************************************");
			System.out.println("*    DESAFIO - ACADEMIA CAPGEMINI     *");
			System.out.println("***************************************");
			System.out.println("* 1. Questão 01 (escada de tamanho n) *");
			System.out.println("* 2. Questão 02 (validação de senha)  *");
			System.out.println("* 3. Questão 03 (anagrama)            *");
			System.out.println("* 0. Sair                             *");
			System.out.println("***************************************");

			System.out.print("Digite uma opção: ");
			String opcao = teclado.next();
			System.out.println();

			if (opcao.equals("0")) { // SAIR DO MENU
				break;
			}

			switch (opcao) {
			case "1": // QUESTÃO 01
				System.out.print("(QUESTÃO 01) Digite um número para definir o tamanho da escada: ");
				int qtdDegraus = teclado.nextInt();
				List<String> degraus = Escada.questao01(qtdDegraus);
				degraus.forEach(d -> System.out.println(d));
				System.out.println();
				break;

			case "2": // QUESTÃO 02
				System.out.print("(QUESTÃO 02) Digite uma senha forte: ");
				String senha = teclado.next();
				System.out.println(Senha.questao02(senha));
				System.out.println();
				break;

			case "3": // QUESTÃO 03
				System.out.print("(QUESTÃO 03) Digite alguma palavra para checar a quantidade de anagramas: ");
				String palavra = teclado.next();
				System.out.println(Anagrama.questao03(palavra));
				System.out.println();
				break;

			default:
				System.err.println("Digite uma opção válida!");
			}
		}
	}

}
