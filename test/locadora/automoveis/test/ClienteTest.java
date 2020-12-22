package locadora.automoveis.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import locadora.automoveis.Cliente;

public class ClienteTest {
	
	@Test
	public void testCadastrarCliente() {

		// clientes
		Cliente c1 = new Cliente();
		c1.setCodCliente(2000);
		c1.setNome("Luiz Souza");
		c1.setTelefone("(21)94444-2222");
		c1.setEndereco("Ruas Manoel Bezerra, 125.");
		c1.setCep("27750-002");
		c1.setEmail("luiz@email.com");

		Cliente c2 = new Cliente();
		c2.setCodCliente(2002);
		c2.setNome("Marcos Mello");
		c2.setTelefone("(21)1111-3333");
		c2.setEndereco("Rua Assis Brand�o, 23.");
		c2.setCep("27750-111");
		c2.setEmail("marcos@email.com");

		Cliente c3 = new Cliente();
		c3.setCodCliente(2003);
		c3.setNome("Andre Freitas");
		c3.setTelefone("(21)3333-1111");
		c3.setEndereco("Rua Oliveira, 15.");
		c3.setCep("27750-002");
		c3.setEmail("andre@email.com");

		Cliente c = new Cliente();
		List<Cliente> clientes = new ArrayList<>();

		// insere cada cliente
		clientes.add(c.cadastraCliente(c1));
		clientes.add(c.cadastraCliente(c2));
		clientes.add(c.cadastraCliente(c3));

		int expected = 3;

		assertEquals(expected, clientes.size());
		assertTrue(clientes.contains(c1));
		assertTrue(clientes.contains(c2));
		assertTrue(clientes.contains(c3));
	}

	@Test
	public void testAlterarCliente() {

		// clientes
		Cliente c1 = new Cliente();
		c1.setCodCliente(2001);
		c1.setNome("Luiz Souza");
		c1.setTelefone("(21)94444-2222");
		c1.setEndereco("Rua Manoel Bezerra, 125.");
		c1.setCep("27751-333");
		c1.setEmail("luiz@email.com");

		Cliente c2 = new Cliente();
		c2.setCodCliente(2002);
		c2.setNome("Marcos Mello");
		c2.setTelefone("(21)1111-3333");
		c2.setEndereco("Rua Assis Brand�o, 23.");
		c2.setCep("27750-111");
		c2.setEmail("marcos@email.com");

		Cliente c3 = new Cliente();
		c3.setCodCliente(2003);
		c3.setNome("Andre Freitas");
		c3.setTelefone("(21)3333-1111");
		c3.setEndereco("Rua Oliveira, 15.");
		c3.setCep("27750-002");
		c3.setEmail("andre@email.com");

		Cliente c = new Cliente();
		List<Cliente> clientes = new ArrayList<>();

		// insere cliente
		clientes.add(c.cadastraCliente(c1));
		clientes.add(c.cadastraCliente(c2));
		clientes.add(c.cadastraCliente(c3));

		// informa��es para altera��o do cliente
		Cliente c4 = new Cliente();
		c4.setCodCliente(2003);
		c4.setNome("Jos� Assis");
		c4.setTelefone("(21)6666-7777");
		c4.setEndereco("Rua Martins, 99.");
		c4.setCep("28850-002");
		c4.setEmail("jose@email.com");

		// altera cliente
		clientes = c.alteraCliente(clientes, c4);

		int expected = 3;

		assertEquals(expected, clientes.size());
		assertTrue(clientes.contains(c1));
		assertTrue(clientes.contains(c2));
		assertFalse(clientes.contains(c3));
		assertTrue(clientes.contains(c4));

	}

	@Test
	public void testRemoverCliente() {

		// clientes
		Cliente c1 = new Cliente();
		c1.setCodCliente(2001);
		c1.setNome("Luiz Souza");
		c1.setTelefone("(21)94444-2222");
		c1.setEndereco("Rua Manoel Bezerra, 125.");
		c1.setCep("27751-333");
		c1.setEmail("luiz@email.com");

		Cliente c2 = new Cliente();
		c2.setCodCliente(2002);
		c2.setNome("Marcos Mello");
		c2.setTelefone("(21)1111-3333");
		c2.setEndereco("Rua Assis Brand�o, 23.");
		c2.setCep("27750-111");
		c2.setEmail("marcos@email.com");

		Cliente c3 = new Cliente();
		c3.setCodCliente(2003);
		c3.setNome("Andre Freitas");
		c3.setTelefone("(21)3333-1111");
		c3.setEndereco("Rua Oliveira, 15.");
		c3.setCep("27750-002");
		c3.setEmail("andre@email.com");

		Cliente c = new Cliente();
		List<Cliente> clientes = new ArrayList<>();

		// insere cliente
		clientes.add(c.cadastraCliente(c1));
		clientes.add(c.cadastraCliente(c2));
		clientes.add(c.cadastraCliente(c3));

		int codcliente = 2003; // c�digo do cliente a ser removido

		// remove cliente
		clientes = c.removeCliente(clientes, codcliente);

		int expected = 2;

		assertEquals(expected, clientes.size());
		assertTrue(clientes.contains(c1));
		assertTrue(clientes.contains(c2));
		assertFalse(clientes.contains(c3));
	}

}
