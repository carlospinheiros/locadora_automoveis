package locadora.automoveis.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import locadora.automoveis.Cartao;

public class CartaoTest {

	// realiza testes em todas as variaveis da classe Cartao
	@Test
	public void testBanco() {

		Cartao c1 = new Cartao();
		String banco = "Bradesco";
		String expected = "Bradesco";
		c1.setBanco(banco);
		assertEquals(expected, c1.getBanco());
	}

	@Test
	public void testAgencia() {

		Cartao c2 = new Cartao();
		String agencia = "1063-3";
		String expected = "1063-3";
		c2.setAgencia(agencia);
		assertEquals(expected, c2.getAgencia());
	}

	@Test
	public void testConta() {

		Cartao c3 = new Cartao();
		String conta = "1985-45";
		String expected = "1985-45";
		c3.setConta(conta);
		assertEquals(expected, c3.getConta());
	}
	
	@Test
	public void testNumeroCartao() {

		Cartao c4 = new Cartao();
		String numeroCartao = "1024-55684-78";
		String expected = "1024-55684-78";
		c4.setNumeroCartao(numeroCartao);
		assertEquals(expected, c4.getNumeroCartao());
	}

}
