package locadora.automoveis.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import locadora.automoveis.NotaFiscal;

public class NotaFiscalTest {

	// realiza testes em todas as variaveis da classe Nota Fiscal
	@Test
	public void testNomeCliente() {

		NotaFiscal nf1 = new NotaFiscal();
		String nome = "André Souza";
		String expected = "André Souza";
		nf1.setNomeCliente(nome);
		assertEquals(expected, nf1.getNomeCliente());
	}

	@Test
	public void testCPF() {

		NotaFiscal nf2 = new NotaFiscal();
		String cpf = "123222456-99";
		String expected = "123222456-99";
		nf2.setCpf(cpf);
		assertEquals(expected, nf2.getCpf());
	}

	@Test
	public void testCodigoVeiculo() {

		NotaFiscal nf3 = new NotaFiscal();
		int codVeiculo = 31005;
		int expected = 31005;
		nf3.setCodveiculo(codVeiculo);
		assertEquals(expected, nf3.getCodigoVeiculo());
	}

	@Test
	public void testModelo() {

		NotaFiscal nf4 = new NotaFiscal();
		String modelo = "Corolla";
		String expected = "Corolla";
		nf4.setModelo(modelo);
		assertEquals(expected, nf4.getModelo());
	}

	@Test
	public void testFabricante() {

		NotaFiscal nf5 = new NotaFiscal();
		String fabricante = "Toyota";
		String expected = "Toyota";
		nf5.setFabricante(fabricante);
		assertEquals(expected, nf5.getFabricante());
	}

	@Test
	public void testValorAluguel() {

		NotaFiscal nf6 = new NotaFiscal();
		double valorAluguel = 1500.00;
		double expected = 1500.00;
		nf6.setValorAluguel(valorAluguel);
		assertEquals(expected, nf6.getValorAluguel(), 0.0);
	}

	@Test
	public void testEmitirNotaFiscal() {

		// Nota fiscal
		NotaFiscal nf = new NotaFiscal();
		nf.setNomeCliente("Lucas Barreiros");
		nf.setCpf("123456789-00");
		nf.setCodveiculo(41005);
		nf.setModelo("Onix");
		nf.setFabricante("Chevrlet");
		nf.setValorAluguel(1000.00);

		// emitir Nota Fiscal
		NotaFiscal GerarNota = new NotaFiscal();
		List<NotaFiscal> NotasFiscais = new ArrayList<>();

		NotasFiscais.add(GerarNota.emitirNotaFiscal(nf));

		int expected = 1;

		assertEquals(expected, NotasFiscais.size());
		assertTrue(NotasFiscais.contains(nf));
	}

}
