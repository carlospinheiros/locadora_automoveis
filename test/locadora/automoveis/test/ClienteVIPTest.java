package locadora.automoveis.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import locadora.automoveis.ClienteVIP;

public class ClienteVIPTest {

	// realiza testes nas variaveis da classe clienteVIP
	@Test
	public void testTaxaDesconto() {

		ClienteVIP ca = new ClienteVIP();
		double TaxaDesconto = 20.00;
		double expected = 20.00;
		ca.setTaxaDesconto(TaxaDesconto);
		assertEquals(expected, ca.getTaxaDesconto(), 0.0);
	}

	@Test
	public void testCadastrarClienteVIP() {

		// clientes
		ClienteVIP c1 = new ClienteVIP();
		c1.setCodigoClienteVIP(2100);
		c1.setNome("Luiz Souza");
		c1.setTelefone("(21)94444-2222");
		c1.setEndereco("Ruas Manoel Bezerra, 125.");
		c1.setCep("27750-002");
		c1.setEmail("luiz@email.com");
		c1.setTaxaDesconto(20.00);

		ClienteVIP c2 = new ClienteVIP();
		c2.setCodigoClienteVIP(2102);
		c2.setNome("Marcos Mello");
		c2.setTelefone("(21)1111-3333");
		c2.setEndereco("Rua Assis Brandão, 23.");
		c2.setCep("27750-111");
		c2.setEmail("marcos@email.com");
		c2.setTaxaDesconto(20.00);

		ClienteVIP c3 = new ClienteVIP();
		c3.setCodigoClienteVIP(2103);
		c3.setNome("Andre Freitas");
		c3.setTelefone("(21)3333-1111");
		c3.setEndereco("Rua Oliveira, 15.");
		c3.setCep("27750-002");
		c3.setEmail("andre@email.com");
		c3.setTaxaDesconto(20.00);

		ClienteVIP c = new ClienteVIP();
		List<ClienteVIP> clientes = new ArrayList<>();

		// insere cada cliente
		clientes.add(c.cadastraClienteVIP(c1));
		clientes.add(c.cadastraClienteVIP(c2));
		clientes.add(c.cadastraClienteVIP(c3));

		int expected = 3;

		assertEquals(expected, clientes.size());
		assertTrue(clientes.contains(c1));
		assertTrue(clientes.contains(c2));
		assertTrue(clientes.contains(c3));
	}

	@Test
	public void testAlterarClienteVIP() {

		// clientes
		ClienteVIP c1 = new ClienteVIP();
		c1.setCodigoClienteVIP(2101);
		c1.setNome("Luiz Souza");
		c1.setTelefone("(21)94444-2222");
		c1.setEndereco("Rua Manoel Bezerra, 125.");
		c1.setCep("27751-333");
		c1.setEmail("luiz@email.com");
		c1.setTaxaDesconto(20.00);

		ClienteVIP c2 = new ClienteVIP();
		c2.setCodigoClienteVIP(2102);
		c2.setNome("Marcos Mello");
		c2.setTelefone("(21)1111-3333");
		c2.setEndereco("Rua Assis Brandão, 23.");
		c2.setCep("27750-111");
		c2.setEmail("marcos@email.com");
		c2.setTaxaDesconto(20.00);

		ClienteVIP c3 = new ClienteVIP();
		c3.setCodigoClienteVIP(2103);
		c3.setNome("Andre Freitas");
		c3.setTelefone("(21)3333-1111");
		c3.setEndereco("Rua Oliveira, 15.");
		c3.setCep("27750-002");
		c3.setEmail("andre@email.com");
		c3.setTaxaDesconto(20.00);

		ClienteVIP c = new ClienteVIP();
		List<ClienteVIP> clientes = new ArrayList<>();

		// insere cliente
		clientes.add(c.cadastraClienteVIP(c1));
		clientes.add(c.cadastraClienteVIP(c2));
		clientes.add(c.cadastraClienteVIP(c3));

		// informações para alteração do cliente
		ClienteVIP c4 = new ClienteVIP();
		c4.setCodigoClienteVIP(2103);
		c4.setNome("José Assis");
		c4.setTelefone("(21)6666-7777");
		c4.setEndereco("Rua Martins, 99.");
		c4.setCep("28850-002");
		c4.setEmail("jose@email.com");
		c4.setTaxaDesconto(25.00);

		// altera cliente
		clientes = c.alteraClienteVIP(clientes, c4);

		int expected = 3;

		assertEquals(expected, clientes.size());
		assertTrue(clientes.contains(c1));
		assertTrue(clientes.contains(c2));
		assertFalse(clientes.contains(c3));
		assertTrue(clientes.contains(c4));

	}

	@Test
	public void testRemoverClienteVIP() {

		// clientes
		ClienteVIP c1 = new ClienteVIP();
		c1.setCodigoClienteVIP(2101);
		c1.setNome("Luiz Souza");
		c1.setTelefone("(21)94444-2222");
		c1.setEndereco("Rua Manoel Bezerra, 125.");
		c1.setCep("27751-333");
		c1.setEmail("luiz@email.com");
		c1.setTaxaDesconto(20.00);

		ClienteVIP c2 = new ClienteVIP();
		c2.setCodigoClienteVIP(2102);
		c2.setNome("Marcos Mello");
		c2.setTelefone("(21)1111-3333");
		c2.setEndereco("Rua Assis Brandão, 23.");
		c2.setCep("27750-111");
		c2.setEmail("marcos@email.com");
		c2.setTaxaDesconto(20.00);

		ClienteVIP c3 = new ClienteVIP();
		c3.setCodigoClienteVIP(2103);
		c3.setNome("Andre Freitas");
		c3.setTelefone("(21)3333-1111");
		c3.setEndereco("Rua Oliveira, 15.");
		c3.setCep("27750-002");
		c3.setEmail("andre@email.com");
		c3.setTaxaDesconto(20.00);

		ClienteVIP c = new ClienteVIP();
		List<ClienteVIP> clientes = new ArrayList<>();

		// insere cliente
		clientes.add(c.cadastraClienteVIP(c1));
		clientes.add(c.cadastraClienteVIP(c2));
		clientes.add(c.cadastraClienteVIP(c3));

		int codcliente = 2103; // código do cliente a ser removido

		// remove cliente
		clientes = c.removeClienteVIP(clientes, codcliente);

		int expected = 2;

		assertEquals(expected, clientes.size());
		assertTrue(clientes.contains(c1));
		assertTrue(clientes.contains(c2));
		assertFalse(clientes.contains(c3));
	}

}
