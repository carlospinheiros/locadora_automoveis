package locadora.automoveis.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import locadora.automoveis.Luxo;

public class LuxoTest {

	@Test
	public void testCadastrarVeiculoLuxo() {

		// veiculos de luxo
		Luxo l1 = new Luxo();
		l1.setCodigoLuxo(31001);
		l1.setModelo("Classe C");
		l1.setFabricante("Mercedes");
		l1.setAno(2015);
		l1.setCor("Preto");
		l1.setChassis("12-2322-jk-21");
		l1.setQuilometragem(10000);
		l1.setValorDia(250.00);

		Luxo l2 = new Luxo();
		l2.setCodigoLuxo(31002);
		l2.setModelo("A6");
		l2.setFabricante("Audi");
		l2.setAno(2016);
		l2.setCor("Prata");
		l2.setChassis("88ii2-2322-2ll5i-25");
		l2.setQuilometragem(5000);
		l2.setValorDia(220.00);

		Luxo l3 = new Luxo();
		l3.setCodigoLuxo(31003);
		l3.setModelo("Azera");
		l3.setFabricante("Hyundai");
		l3.setAno(2015);
		l3.setCor("Branco");
		l3.setChassis("kljn-1568-olk-256");
		l3.setQuilometragem(9000);
		l3.setValorDia(215.00);

		Luxo l = new Luxo();
		List<Luxo> luxs = new ArrayList<>();

		// insere cada veículo de luxo
		luxs.add(l.cadastraVeiculoLuxo(l1));
		luxs.add(l.cadastraVeiculoLuxo(l2));
		luxs.add(l.cadastraVeiculoLuxo(l3));

		int expected = 3;

		assertEquals(expected, luxs.size());
		assertTrue(luxs.contains(l1));
		assertTrue(luxs.contains(l2));
		assertTrue(luxs.contains(l3));
	}

	@Test
	public void testAlterarVeiculoLuxo() {

		// veiculos de luxo
		Luxo l1 = new Luxo();
		l1.setCodigoLuxo(31001);
		l1.setModelo("Classe C");
		l1.setFabricante("Mercedes");
		l1.setAno(2015);
		l1.setCor("Preto");
		l1.setChassis("12-2322-jk-21");
		l1.setQuilometragem(10000);
		l1.setValorDia(250.00);

		Luxo l2 = new Luxo();
		l2.setCodigoLuxo(31002);
		l2.setModelo("A6");
		l2.setFabricante("Audi");
		l2.setAno(2016);
		l2.setCor("Prata");
		l2.setChassis("88ii2-2322-2ll5i-25");
		l2.setQuilometragem(5000);
		l2.setValorDia(220.00);

		Luxo l3 = new Luxo();
		l3.setCodigoLuxo(31003);
		l3.setModelo("Azera");
		l3.setFabricante("Hyundai");
		l3.setAno(2015);
		l3.setCor("Branco");
		l3.setChassis("kljn-1568-olk-256");
		l3.setQuilometragem(9000);
		l3.setValorDia(215.00);

		Luxo l = new Luxo();
		List<Luxo> luxs = new ArrayList<>();

		// insere cada veículo de luxo
		luxs.add(l.cadastraVeiculoLuxo(l1));
		luxs.add(l.cadastraVeiculoLuxo(l2));
		luxs.add(l.cadastraVeiculoLuxo(l3));

		// informações para alteração do veículo de luxo
		Luxo l4 = new Luxo();
		l4.setCodigoLuxo(31003);
		l4.setModelo("Azera");
		l4.setFabricante("Hyundai");
		l4.setAno(2020);
		l4.setCor("Branco");
		l4.setChassis("kljn-1568-olk-256");
		l4.setQuilometragem(9000);
		l4.setValorDia(225.00);

		// altera veículo de luxo
		luxs = l.alteraVeiculoLuxo(luxs, l4);

		int expected = 3;

		assertEquals(expected, luxs.size());
		assertTrue(luxs.contains(l1));
		assertTrue(luxs.contains(l2));
		assertFalse(luxs.contains(l3));
		assertTrue(luxs.contains(l4));

	}

	@Test
	public void testRemoverVeiculoLuxo() {

		// veiculos de luxo
		Luxo l1 = new Luxo();
		l1.setCodigoLuxo(31001);
		l1.setModelo("Classe C");
		l1.setFabricante("Mercedes");
		l1.setAno(2015);
		l1.setCor("Preto");
		l1.setChassis("12-2322-jk-21");
		l1.setQuilometragem(10000);
		l1.setValorDia(250.00);

		Luxo l2 = new Luxo();
		l2.setCodigoLuxo(31002);
		l2.setModelo("A6");
		l2.setFabricante("Audi");
		l2.setAno(2016);
		l2.setCor("Prata");
		l2.setChassis("88ii2-2322-2ll5i-25");
		l2.setQuilometragem(5000);
		l2.setValorDia(220.00);

		Luxo l3 = new Luxo();
		l3.setCodigoLuxo(31003);
		l3.setModelo("Azera");
		l3.setFabricante("Hyundai");
		l3.setAno(2015);
		l3.setCor("Branco");
		l3.setChassis("kljn-1568-olk-256");
		l3.setQuilometragem(9000);
		l3.setValorDia(215.00);

		Luxo l = new Luxo();
		List<Luxo> luxs = new ArrayList<>();

		// insere cada veículo de luxo
		luxs.add(l.cadastraVeiculoLuxo(l1));
		luxs.add(l.cadastraVeiculoLuxo(l2));
		luxs.add(l.cadastraVeiculoLuxo(l3));

		int codluxo = 31003; // código do veículo de luxo a ser removido

		// remove veículo de luxo
		luxs = l.removeVeiculoLuxo(luxs, codluxo);

		int expected = 2;

		assertEquals(expected, luxs.size());
		assertTrue(luxs.contains(l1));
		assertTrue(luxs.contains(l2));
		assertFalse(luxs.contains(l3));
	}

}
