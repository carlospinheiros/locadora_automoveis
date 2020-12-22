package locadora.automoveis.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import locadora.automoveis.Cliente;
import locadora.automoveis.ClienteVIP;
import locadora.automoveis.Locadora;
import locadora.automoveis.Luxo;
import locadora.automoveis.Reserva;

public class ReservaTest {

	// realiza teste a variavel da classe Reserva
	@Test
	public void testCodigoReserva() {

		Reserva r1 = new Reserva();
		String codigoReserva = "r12356";
		String expected = "r12356";
		r1.setCodigoReserva(codigoReserva);
		assertEquals(expected, r1.getCodigoReserva());
	}

	@Test
	public void testReservaCliente() {

		Reserva r1 = new Reserva();
		r1.setCodigoReserva("R1234555");

		// locadora
		Locadora locadora = new Locadora();
		locadora.setCodigoLocadora(101);
		locadora.setEstado("Rio de Janeiro");
		locadora.setUf("RJ");
		locadora.setTelefone("(21)94444-2222");
		locadora.setEndereco("Ruas Manoel Bezerra, 125.");
		locadora.setCep("27750-002");
		locadora.setEmail("fallscarrj@email.com");

		// veiculo de luxo
		Luxo veicluxo = new Luxo();
		veicluxo.setCodigoLuxo(31001);
		veicluxo.setModelo("Classe C");
		veicluxo.setFabricante("Mercedes");
		veicluxo.setAno(2015);
		veicluxo.setCor("Preto");
		veicluxo.setChassis("12-2322-jk-21");
		veicluxo.setQuilometragem(10000);
		veicluxo.setValorDia(250.00);

		// cliente
		Cliente cliente = new Cliente();
		cliente.setCodCliente(2000);
		cliente.setNome("Luiz Souza");
		cliente.setTelefone("(21)94444-2222");
		cliente.setEndereco("Ruas Manoel Bezerra, 125.");
		cliente.setCep("27750-002");
		cliente.setEmail("luiz@email.com");

		// criando expected
		Reserva reserva = new Reserva();
		reserva.setCodigoReserva("R1234555");
		Reserva expected = new Reserva();
		expected = reserva.inserirReservaCliente(reserva, locadora, veicluxo, cliente);

		assertEquals(expected, r1.inserirReservaCliente(reserva, locadora, veicluxo, cliente));

	}

	@Test
	public void testReservaClienteVIP() {

		Reserva r1 = new Reserva();
		r1.setCodigoReserva("R1234567");

		// locadora
		Locadora locadora = new Locadora();
		locadora.setCodigoLocadora(101);
		locadora.setEstado("Rio de Janeiro");
		locadora.setUf("RJ");
		locadora.setTelefone("(21)94444-2222");
		locadora.setEndereco("Ruas Manoel Bezerra, 125.");
		locadora.setCep("27750-002");
		locadora.setEmail("fallscarrj@email.com");

		// veiculo de luxo
		Luxo veicluxo = new Luxo();
		veicluxo.setCodigoLuxo(31001);
		veicluxo.setModelo("Classe C");
		veicluxo.setFabricante("Mercedes");
		veicluxo.setAno(2015);
		veicluxo.setCor("Preto");
		veicluxo.setChassis("12-2322-jk-21");
		veicluxo.setQuilometragem(10000);
		veicluxo.setValorDia(250.00);

		// cliente vip
		ClienteVIP clientevip = new ClienteVIP();
		clientevip.setCodigoClienteVIP(2100);
		clientevip.setNome("Luiz Souza");
		clientevip.setTelefone("(21)94444-2222");
		clientevip.setEndereco("Ruas Manoel Bezerra, 125.");
		clientevip.setCep("27750-002");
		clientevip.setEmail("luiz@email.com");
		clientevip.setTaxaDesconto(20.00);

		// criando expected
		Reserva reserva = new Reserva();
		reserva.setCodigoReserva("R1234567");
		Reserva expected = new Reserva();
		expected = reserva.inserirReservaClienteVIP(reserva, locadora, veicluxo, clientevip);

		assertEquals(expected, r1.inserirReservaClienteVIP(reserva, locadora, veicluxo, clientevip));
	}

}
