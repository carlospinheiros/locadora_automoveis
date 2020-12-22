package locadora.automoveis.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import locadora.automoveis.Cartao;
import locadora.automoveis.Cheque;
import locadora.automoveis.Pagamento;

public class PagamentoTest {

	// realiza teste na variável da classe Pagamento
	@Test
	public void testValorAluguel() {

		Pagamento p1 = new Pagamento();
		double valorAluguel = 1500.00;
		double expected = 1500.00;
		p1.setValorAluguel(valorAluguel);
		assertEquals(expected, p1.getValorAluguel(), 0.0);
	}

	@Test
	public void testEfetuarPagamentoCheque() {

		Cheque ch1 = new Cheque();
		ch1.setBanco("Banco do Brasil");
		ch1.setAgencia("10631-3");
		ch1.setConta("1985-451");
		ch1.setNumeroCheque("11-1024-55684-78");

		Pagamento p = new Pagamento();
		assertTrue(p.efetuarPagamentoCheque(ch1));
	}
	
	@Test
	public void testEfetuarPagamentoCartao() {

		Cartao ca1 = new Cartao();
		ca1.setBanco("Caixa Econômica Federal");
		ca1.setAgencia("1012-3");
		ca1.setConta("1985-45");
		ca1.setNumeroCartao("1112-1024-0984-1178");

		Pagamento p = new Pagamento();
		assertTrue(p.efetuarPagamentoCartao(ca1));
	}

}
