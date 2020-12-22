package locadora.automoveis.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import locadora.automoveis.Cheque;

public class ChequeTest {

	// realiza testes em todas as variaveis da classe Cheque
	@Test
	public void testBanco() {

		Cheque c1 = new Cheque();
		String banco = "Banco do Brasil";
		String expected = "Banco do Brasil";
		c1.setBanco(banco);
		assertEquals(expected, c1.getBanco());
	}

	@Test
	public void testAgencia() {

		Cheque c2 = new Cheque();
		String agencia = "10631-3";
		String expected = "10631-3";
		c2.setAgencia(agencia);
		assertEquals(expected, c2.getAgencia());
	}

	@Test
	public void testConta() {

		Cheque c3 = new Cheque();
		String conta = "1985-451";
		String expected = "1985-451";
		c3.setConta(conta);
		assertEquals(expected, c3.getConta());
	}

	@Test
	public void testNumeroCheque() {

		Cheque c4 = new Cheque();
		String numeroCheque = "11-1024-55684-78";
		String expected = "11-1024-55684-78";
		c4.setNumeroCheque(numeroCheque);
		assertEquals(expected, c4.getNumeroCheque());
	}

}
