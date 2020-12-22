package locadora.automoveis.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import locadora.automoveis.Automovel;

public class AutomovelTest {

	// realiza testes em todas as variaveis da classe Automovel
	@Test
	public void testModelo() {

		Automovel a1 = new Automovel();
		String modelo = "Corolla";
		String expected = "Corolla";
		a1.setModelo(modelo);
		assertEquals(expected, a1.getModelo());
	}

	@Test
	public void testFabricante() {

		Automovel a2 = new Automovel();
		String fabricante = "Toyota";
		String expected = "Toyota";
		a2.setFabricante(fabricante);
		assertEquals(expected, a2.getFabricante());
	}

	@Test
	public void testAno() {

		Automovel a3 = new Automovel();
		int ano = 2015;
		int expected = 2015;
		a3.setAno(ano);
		assertEquals(expected, a3.getAno());
	}

	@Test
	public void testCor() {

		Automovel a4 = new Automovel();
		String cor = "Prata";
		String expected = "Prata";
		a4.setCor(cor);
		assertEquals(expected, a4.getCor());
	}

	@Test
	public void testChassis() {

		Automovel a5 = new Automovel();
		String chassis = "27765t-220-2jk25-999";
		String expected = "27765t-220-2jk25-999";
		a5.setChassis(chassis);
		assertEquals(expected, a5.getChassis());
	}

	@Test
	public void testQuilometragem() {

		Automovel a6 = new Automovel();
		int quilometragem = 10000;
		int expected = 10000;
		a6.setQuilometragem(quilometragem);
		assertEquals(expected, a6.getQuilometragem());
	}

	@Test
	public void testValorDia() {

		Automovel a7 = new Automovel();
		double valor_dia = 50.00;
		double expected = 50.00;
		a7.setValorDia(valor_dia);
		assertEquals(expected, a7.getValorDia(), 0.0);
	}

}
