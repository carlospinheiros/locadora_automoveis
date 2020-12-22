package locadora.automoveis.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import locadora.automoveis.Locadora;

public class LocadoraTest {

	@Test
	public void testCadastrarLocadora() {

		// locadoras
		Locadora l1 = new Locadora();
		l1.setCodigoLocadora(101);
		l1.setEstado("Rio de Janeiro");
		l1.setUf("RJ");
		l1.setTelefone("(21)94444-2222");
		l1.setEndereco("Ruas Manoel Bezerra, 125.");
		l1.setCep("27750-002");
		l1.setEmail("fallscarrj@email.com");

		Locadora l2 = new Locadora();
		l2.setCodigoLocadora(102);
		l2.setEstado("São Paulo");
		l2.setUf("SP");
		l2.setTelefone("(11)2111-3334");
		l2.setEndereco("Rua Assis Brandão, 23.");
		l2.setCep("27750-111");
		l2.setEmail("fallscarsp@email.com");

		Locadora l3 = new Locadora();
		l3.setCodigoLocadora(103);
		l3.setEstado("Brasília");
		l3.setUf("DF");
		l3.setTelefone("(61)5333-1221");
		l3.setEndereco("Rua Oliveira, 15.");
		l3.setCep("27750-002");
		l3.setEmail("fallscardf@email.com");

		Locadora l = new Locadora();
		List<Locadora> locadoras = new ArrayList<>();

		// insere cada locadora
		locadoras.add(l.cadastraLocadora(l1));
		locadoras.add(l.cadastraLocadora(l2));
		locadoras.add(l.cadastraLocadora(l3));

		int expected = 3;

		assertEquals(expected, locadoras.size());
		assertTrue(locadoras.contains(l1));
		assertTrue(locadoras.contains(l2));
		assertTrue(locadoras.contains(l3));
	}

	@Test
	public void testAlterarLocadora() {

		// locadoras
		Locadora l1 = new Locadora();
		l1.setCodigoLocadora(101);
		l1.setEstado("Rio de Janeiro");
		l1.setUf("RJ");
		l1.setTelefone("(21)94444-2222");
		l1.setEndereco("Ruas Manoel Bezerra, 125.");
		l1.setCep("27750-002");
		l1.setEmail("fallscarrj@email.com");

		Locadora l2 = new Locadora();
		l2.setCodigoLocadora(102);
		l2.setEstado("São Paulo");
		l2.setUf("SP");
		l2.setTelefone("(11)2111-3334");
		l2.setEndereco("Rua Assis Brandão, 23.");
		l2.setCep("27750-111");
		l2.setEmail("fallscarsp@email.com");

		Locadora l3 = new Locadora();
		l3.setCodigoLocadora(103);
		l3.setEstado("Brasília");
		l3.setUf("DF");
		l3.setTelefone("(61)5333-1221");
		l3.setEndereco("Rua Oliveira, 15.");
		l3.setCep("27750-002");
		l3.setEmail("fallscardf@email.com");

		Locadora l = new Locadora();
		List<Locadora> locadoras = new ArrayList<>();

		// insere cada locadora
		locadoras.add(l.cadastraLocadora(l1));
		locadoras.add(l.cadastraLocadora(l2));
		locadoras.add(l.cadastraLocadora(l3));

		// informações para alteração da locadora
		Locadora l4 = new Locadora();
		l4.setCodigoLocadora(103);
		l4.setEstado("Brasília");
		l4.setUf("DF");
		l4.setTelefone("(61)6833-1221");
		l4.setEndereco("Rua Marcos Oliveira, 222.");
		l4.setCep("29950-002");
		l4.setEmail("fallscardf@email.com");

		// altera locadora
		locadoras = l.alteraLocadora(locadoras, l4);

		int expected = 3;

		assertEquals(expected, locadoras.size());
		assertTrue(locadoras.contains(l1));
		assertTrue(locadoras.contains(l2));
		assertFalse(locadoras.contains(l3));
		assertTrue(locadoras.contains(l4));

	}

	@Test
	public void testRemoverLocadora() {

		// locadoras
		Locadora l1 = new Locadora();
		l1.setCodigoLocadora(101);
		l1.setEstado("Rio de Janeiro");
		l1.setUf("RJ");
		l1.setTelefone("(21)94444-2222");
		l1.setEndereco("Ruas Manoel Bezerra, 125.");
		l1.setCep("27750-002");
		l1.setEmail("fallscarrj@email.com");

		Locadora l2 = new Locadora();
		l2.setCodigoLocadora(102);
		l2.setEstado("São Paulo");
		l2.setUf("SP");
		l2.setTelefone("(11)2111-3334");
		l2.setEndereco("Rua Assis Brandão, 23.");
		l2.setCep("27750-111");
		l2.setEmail("fallscarsp@email.com");

		Locadora l3 = new Locadora();
		l3.setCodigoLocadora(103);
		l3.setEstado("Brasília");
		l3.setUf("DF");
		l3.setTelefone("(61)5333-1221");
		l3.setEndereco("Rua Oliveira, 15.");
		l3.setCep("27750-002");
		l3.setEmail("fallscardf@email.com");

		Locadora l = new Locadora();
		List<Locadora> locadoras = new ArrayList<>();

		// insere cada locadora
		locadoras.add(l.cadastraLocadora(l1));
		locadoras.add(l.cadastraLocadora(l2));
		locadoras.add(l.cadastraLocadora(l3));

		int codlocadora = 103; // código do cliente a ser removido

		// remove locadora
		locadoras = l.removeLocadora(locadoras, codlocadora);

		int expected = 2;

		assertEquals(expected, locadoras.size());
		assertTrue(locadoras.contains(l1));
		assertTrue(locadoras.contains(l2));
		assertFalse(locadoras.contains(l3));
	}

}
