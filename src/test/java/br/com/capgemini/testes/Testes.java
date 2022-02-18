package br.com.capgemini.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.capgemini.services.Anagrama;
import br.com.capgemini.services.Escada;
import br.com.capgemini.services.Senha;

class Testes {

	@Test
	void TesteEscada01() {
		var escada = Escada.questao01(5);
		assertEquals(5, escada.size());
	}

	@Test
	void TesteEscada02() {
		var escada = Escada.questao01(6);
		assertEquals(6, escada.size());
	}

	@Test
	void TesteSenhaErrada() {
		var senha = Senha.questao02("Ya3");
		assertEquals(3, senha);
	}

	@Test
	void TesteSenhaCorreta() {
		var senha = Senha.questao02("Ya3&ab");
		assertEquals(0, senha);
	}

	@Test
	void TesteAnagrama01() {
		var anagrama = Anagrama.questao03("ovo");
		assertEquals(2, anagrama);
	}

	@Test
	void TesteAnagrama02() {
		var anagrama = Anagrama.questao03("ifailuhkqq");
		assertEquals(3, anagrama);
	}
}
