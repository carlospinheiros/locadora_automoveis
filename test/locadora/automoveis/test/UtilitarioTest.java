package locadora.automoveis.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import locadora.automoveis.Utilitario;

public class UtilitarioTest {

	@Test
	public void testCadastrarVeiculoUtilitario() {

		// veiculos utilitários
		Utilitario u1 = new Utilitario();
		u1.setCodigoUtilitario(51001);
		u1.setModelo("Blazer");
		u1.setFabricante("Chevrolet");
		u1.setAno(2015);
		u1.setCor("Preto");
		u1.setChassis("12-2322-jk-21");
		u1.setQuilometragem(10000);
		u1.setValorDia(100.00);

		Utilitario u2 = new Utilitario();
		u2.setCodigoUtilitario(51002);
		u2.setModelo("Hilux");
		u2.setFabricante("Toyota");
		u2.setAno(2016);
		u2.setCor("Prata");
		u2.setChassis("88ii2-2322-2ll5i-25");
		u2.setQuilometragem(5000);
		u2.setValorDia(120.00);

		Utilitario u3 = new Utilitario();
		u3.setCodigoUtilitario(51003);
		u3.setModelo("Ford");
		u3.setFabricante("Ranger");
		u3.setAno(2015);
		u3.setCor("Branco");
		u3.setChassis("kljn-1568-olk-256");
		u3.setQuilometragem(9000);
		u3.setValorDia(130.00);

		Utilitario u = new Utilitario();
		List<Utilitario> utilitario = new ArrayList<>();

		// insere cada veículo utilitário
		utilitario.add(u.cadastraVeiculoUtilitario(u1));
		utilitario.add(u.cadastraVeiculoUtilitario(u2));
		utilitario.add(u.cadastraVeiculoUtilitario(u3));

		int expected = 3;

		assertEquals(expected, utilitario.size());
		assertTrue(utilitario.contains(u1));
		assertTrue(utilitario.contains(u2));
		assertTrue(utilitario.contains(u3));
	}

	@Test
	public void testAlterarVeiculoUtilitario() {

		// veiculos utilitários
		Utilitario u1 = new Utilitario();
		u1.setCodigoUtilitario(51001);
		u1.setModelo("Blazer");
		u1.setFabricante("Chevrolet");
		u1.setAno(2015);
		u1.setCor("Preto");
		u1.setChassis("12-2322-jk-21");
		u1.setQuilometragem(10000);
		u1.setValorDia(100.00);

		Utilitario u2 = new Utilitario();
		u2.setCodigoUtilitario(51002);
		u2.setModelo("Hilux");
		u2.setFabricante("Toyota");
		u2.setAno(2016);
		u2.setCor("Prata");
		u2.setChassis("88ii2-2322-2ll5i-25");
		u2.setQuilometragem(5000);
		u2.setValorDia(120.00);

		Utilitario u3 = new Utilitario();
		u3.setCodigoUtilitario(51003);
		u3.setModelo("Ford");
		u3.setFabricante("Ranger");
		u3.setAno(2015);
		u3.setCor("Branco");
		u3.setChassis("kljn-1568-olk-256");
		u3.setQuilometragem(9000);
		u3.setValorDia(130.00);

		Utilitario u = new Utilitario();
		List<Utilitario> utilitario = new ArrayList<>();

		// insere cada veículo de luxo
		utilitario.add(u.cadastraVeiculoUtilitario(u1));
		utilitario.add(u.cadastraVeiculoUtilitario(u2));
		utilitario.add(u.cadastraVeiculoUtilitario(u3));

		// informações para alteração do veículo de luxo
		Utilitario u4 = new Utilitario();
		u4.setCodigoUtilitario(51003);
		u4.setModelo("Ford");
		u4.setFabricante("Ranger");
		u4.setAno(2016);
		u4.setCor("Prata");
		u4.setChassis("kljn-1568-olk-256");
		u4.setQuilometragem(9000);
		u4.setValorDia(135.00);

		// altera veículo de luxo
		utilitario = u.alteraVeiculoUtilitario(utilitario, u4);

		int expected = 3;

		assertEquals(expected, utilitario.size());
		assertTrue(utilitario.contains(u1));
		assertTrue(utilitario.contains(u2));
		assertFalse(utilitario.contains(u3));
		assertTrue(utilitario.contains(u4));

	}

	@Test
	public void testRemoverVeiculoUtilitario() {

		// veiculos utilitários
		Utilitario u1 = new Utilitario();
		u1.setCodigoUtilitario(51001);
		u1.setModelo("Blazer");
		u1.setFabricante("Chevrolet");
		u1.setAno(2015);
		u1.setCor("Preto");
		u1.setChassis("12-2322-jk-21");
		u1.setQuilometragem(10000);
		u1.setValorDia(100.00);

		Utilitario u2 = new Utilitario();
		u2.setCodigoUtilitario(51002);
		u2.setModelo("Hilux");
		u2.setFabricante("Toyota");
		u2.setAno(2016);
		u2.setCor("Prata");
		u2.setChassis("88ii2-2322-2ll5i-25");
		u2.setQuilometragem(5000);
		u2.setValorDia(120.00);

		Utilitario u3 = new Utilitario();
		u3.setCodigoUtilitario(51003);
		u3.setModelo("Ford");
		u3.setFabricante("Ranger");
		u3.setAno(2015);
		u3.setCor("Branco");
		u3.setChassis("kljn-1568-olk-256");
		u3.setQuilometragem(9000);
		u3.setValorDia(130.00);

		Utilitario u = new Utilitario();
		List<Utilitario> utilitario = new ArrayList<>();

		// insere cada veículo utilitário
		utilitario.add(u.cadastraVeiculoUtilitario(u1));
		utilitario.add(u.cadastraVeiculoUtilitario(u2));
		utilitario.add(u.cadastraVeiculoUtilitario(u3));

		int codluxo = 51003; // código do veículo utilitário a ser removido

		// remove veículo utilitário
		utilitario = u.removeVeiculoUtilitario(utilitario, codluxo);

		int expected = 2;

		assertEquals(expected, utilitario.size());
		assertTrue(utilitario.contains(u1));
		assertTrue(utilitario.contains(u2));
		assertFalse(utilitario.contains(u3));
	}

}
