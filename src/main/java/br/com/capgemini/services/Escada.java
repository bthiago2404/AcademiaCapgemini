package br.com.capgemini.services;

import java.util.ArrayList;
import java.util.List;

public class Escada {

	// QUESTÃO 01
	public static List<String> questao01(int qtdDegraus) {
		List<String> degraus = new ArrayList<>();

		for (int i = 0; i < qtdDegraus; i++) {
			degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
		}
		return degraus;
	}
}
