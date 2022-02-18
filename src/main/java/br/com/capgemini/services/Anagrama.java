package br.com.capgemini.services;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagrama {

	// QUESTÃO 03
	public static int questao03(String palavra) {
		var listSubString = new ArrayList<String>();

		for (var i = 0; i <= palavra.length(); i++) {
			for (var y = 0; y <= palavra.length(); y++) {
				if (y > i) {
					var subString = palavra.substring(i, y).toCharArray();
					Arrays.sort(subString);
					listSubString.add(Arrays.toString(subString));
				}
			}
		}
		var resultadoList = new ArrayList<String>();
		for (var i = 0; i < listSubString.size(); i++) {
			for (var y = 0; y < listSubString.size(); y++) {
				if (y != i) {
					if (listSubString.get(i).equals(listSubString.get(y))) {
						int finalI = i;
						if (resultadoList.stream().noneMatch(
								subStringEncontrada -> subStringEncontrada.equals(listSubString.get(finalI)))) {
							resultadoList.add(listSubString.get(finalI));
						}
					}
				}
			}
		}
		return resultadoList.size();
	}
}
