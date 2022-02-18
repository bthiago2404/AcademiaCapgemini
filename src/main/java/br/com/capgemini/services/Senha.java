package br.com.capgemini.services;

import java.util.ArrayList;
import java.util.List;

public class Senha {

	// CONSTANTE COM O TAMANHO MÍNIMO
	public static final int TAM_MIN = 6;

	// QUESTÃO 02
	public static int questao02(String senha) {
		int quantidade = 0;
		boolean existeCaractere = false;
		boolean existeNumero = false;
		boolean existeMaiuscula = false;
		boolean existeMinuscula = false;
		String[] caracteresPermitidos = { "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+" };
		List<String> mensagens = new ArrayList<>();

		// Validação do tamanho mínimo da senha
		if (senha.length() >= TAM_MIN) {

			// Validação da existência de caracteres especiais
			for (String c : caracteresPermitidos) {
				if (senha.contains(c)) {
					existeCaractere = true;
					break;
				}
			}

			if (!existeCaractere) { // Incrementa 1 caso não exista caractere especial na senha
				quantidade += 1;
				mensagens.add("Não existem caracter especial na sua senha.");
			}

			// Validação da existência de números, letra maiúscula e minúscula
			for (int i = 0; i < senha.length(); i++) {
				// Verifica a existência de números
				if (Character.isDigit(senha.charAt(i)) && existeNumero == false) {
					existeNumero = true;
				}
				// Verifica a existência de letras maiúsculas
				else if (Character.isUpperCase(senha.charAt(i)) && existeMaiuscula == false) {
					existeMaiuscula = true;
				}
				// Verifica a existência de letras minúsculas
				else if (Character.isLowerCase(senha.charAt(i)) && existeMinuscula == false) {
					existeMinuscula = true;
				}
				// Verifica se todas as condições já foram validadas
				if (existeMaiuscula == true && existeMinuscula == true && existeNumero == true) {
					break;
				}
			}

			if (!existeNumero) { // Incrementa 1 caso não exista número na senha
				quantidade += 1;
				mensagens.add("Não existem números na sua senha.");
			}
			if (!existeMaiuscula) { // Incrementa 1 caso não exista letra maiúscula na senha
				quantidade += 1;
				mensagens.add("Não existem letras maiúsculas na sua senha.");
			}
			if (!existeMinuscula) { // Incrementa 1 caso não exista letra minúscula na senha
				quantidade += 1;
				mensagens.add("Não existem letras minúsculas na sua senha.");
			}

			// Caso o tamanho da senha seja menor do que o mínimo sugerido
		} else {
			quantidade = TAM_MIN - senha.length();
			// System.out.println("NECESSÁRIO ADICIONAR " + quantidade + " CARACTERES. (MIN:
			// 06)");
		}
		return quantidade;
	}

}
