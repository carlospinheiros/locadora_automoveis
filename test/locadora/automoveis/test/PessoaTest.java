package locadora.automoveis.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import locadora.automoveis.Pessoa;

public class PessoaTest {
	
	// realiza testes em todas as variaveis da classe pessoa
	@Test
	public void testNome() {

		Pessoa p1 = new Pessoa();
		String nome = "Manoela Assis";
		String expected = "Manoela Assis";
		p1.setNome(nome);
		assertEquals(expected, p1.getNome());
	}

	@Test
	public void testTelefone() {

		Pessoa p3 = new Pessoa();
		String telefone = "(21)96565-2220";
		String expected = "(21)96565-2220";
		p3.setTelefone(telefone);
		assertEquals(expected, p3.getTelefone());
	}

	@Test
	public void testEndereco() {

		Pessoa p5 = new Pessoa();
		String endereco = "Rua Assis Brandão, 125.";
		String expected = "Rua Assis Brandão, 125.";
		p5.setEndereco(endereco);
		assertEquals(expected, p5.getEndereco());
	}

	@Test
	public void testCEP() {

		Pessoa p7 = new Pessoa();
		String cep = "27765-220";
		String expected = "27765-220";
		p7.setCep(cep);
		assertEquals(expected, p7.getCep());
	}

	@Test
	public void testEmail() {

		Pessoa p8 = new Pessoa();
		String email = "teste@email.com";
		String expected = "teste@email.com";
		p8.setEmail(email);
		assertEquals(expected, p8.getEmail());
	}

}
