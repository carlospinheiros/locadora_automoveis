package locadora.automoveis.test;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.Test;

import locadora.automoveis.Aluguel;
import locadora.automoveis.ClienteVIP;
import locadora.automoveis.Luxo;

public class AluguelTest {

	// realiza testes nas variaveis da classe Aluguel
	@Test
	public void testDataSaida() {

		Aluguel a1 = new Aluguel();
		String dataSaida = "21/12/2020";
		String expected = "21/12/2020";
		a1.setDataSaida(dataSaida);
		assertEquals(expected, a1.getDataSaida());
	}

	@Test
	public void testDataEntrega() {

		Aluguel a2 = new Aluguel();
		String dataEntrega = "01/02/2021";
		String expected = "01/02/2021";
		a2.setDataEntrega(dataEntrega);
		assertEquals(expected, a2.getDataEntrega());
	}

	@Test
	public void testAluguelVeiculoLuxoDiaria() throws ParseException {

		// veiculos de luxo
		Luxo luxo = new Luxo();
		luxo.setCodigoLuxo(31001);
		luxo.setModelo("Classe C");
		luxo.setFabricante("Mercedes");
		luxo.setAno(2015);
		luxo.setCor("Preto");
		luxo.setChassis("12-2322-jk-21");
		luxo.setQuilometragem(10000);
		luxo.setValorDia(250.00);

		Aluguel periodo = new Aluguel();
		periodo.setDataSaida("21/12/2020");
		periodo.setDataEntrega("24/12/2020");

		Aluguel calcularAluguel = new Aluguel();

		double valorAluguel = calcularAluguel.calcularAluguelClienteDiaria(periodo, luxo);
		double expected = 750.00;

		assertEquals(expected, valorAluguel, 0.0);
	}

	@Test
	public void testAluguelVeiculoLuxoDiariaClienteVIP() throws ParseException {

		// cliente vip
		ClienteVIP clienteVIP = new ClienteVIP();
		clienteVIP.setCodigoClienteVIP(2100);
		clienteVIP.setNome("Luiz Souza");
		clienteVIP.setTelefone("(21)94444-2222");
		clienteVIP.setEndereco("Ruas Manoel Bezerra, 125.");
		clienteVIP.setCep("27750-002");
		clienteVIP.setEmail("luiz@email.com");
		clienteVIP.setTaxaDesconto(75.00);

		// veiculos de luxo
		Luxo luxo = new Luxo();
		luxo.setCodigoLuxo(31001);
		luxo.setModelo("Classe C");
		luxo.setFabricante("Mercedes");
		luxo.setAno(2015);
		luxo.setCor("Preto");
		luxo.setChassis("12-2322-jk-21");
		luxo.setQuilometragem(10000);
		luxo.setValorDia(250.00);

		Aluguel periodo = new Aluguel();
		periodo.setDataSaida("21/12/2020");
		periodo.setDataEntrega("24/12/2020");

		Aluguel calcularAluguel = new Aluguel();

		double valorAluguel = calcularAluguel.calcularAluguelClienteVIPDiaria(periodo, clienteVIP, luxo);
		double expected = 675.00;

		assertEquals(expected, valorAluguel, 0.0);
	}

}
