package locadora.automoveis.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import locadora.automoveis.Popular;

public class PopularTest {

	@Test
	public void testCadastrarVeiculoPopular() {

		// veiculos populares
		Popular p1 = new Popular();
		p1.setCodigoPopular(41001);
		p1.setModelo("Onix");
		p1.setFabricante("Chevrolet");
		p1.setAno(2015);
		p1.setCor("Preto");
		p1.setChassis("12-2322-jk-21");
		p1.setQuilometragem(10000);
		p1.setValorDia(25.00);

		Popular p2 = new Popular();
		p2.setCodigoPopular(41002);
		p2.setModelo("Uno");
		p2.setFabricante("Fiat");
		p2.setAno(2016);
		p2.setCor("Prata");
		p2.setChassis("88ii2-2322-2ll5i-25");
		p2.setQuilometragem(5000);
		p2.setValorDia(22.00);

		Popular p3 = new Popular();
		p3.setCodigoPopular(41003);
		p3.setModelo("Fiesta");
		p3.setFabricante("Ford");
		p3.setAno(2015);
		p3.setCor("Branco");
		p3.setChassis("kljn-1568-olk-256");
		p3.setQuilometragem(9000);
		p3.setValorDia(21.00);

		Popular p = new Popular();
		List<Popular> popular = new ArrayList<>();

		// insere cada veículo popular
		popular.add(p.cadastraVeiculoPopular(p1));
		popular.add(p.cadastraVeiculoPopular(p2));
		popular.add(p.cadastraVeiculoPopular(p3));

		int expected = 3;

		assertEquals(expected, popular.size());
		assertTrue(popular.contains(p1));
		assertTrue(popular.contains(p2));
		assertTrue(popular.contains(p3));
	}

	@Test
	public void testAlterarVeiculoPopular() {

		// veiculos populares
		Popular p1 = new Popular();
		p1.setCodigoPopular(41001);
		p1.setModelo("Onix");
		p1.setFabricante("Chevrolet");
		p1.setAno(2015);
		p1.setCor("Preto");
		p1.setChassis("12-2322-jk-21");
		p1.setQuilometragem(10000);
		p1.setValorDia(25.00);

		Popular p2 = new Popular();
		p2.setCodigoPopular(41002);
		p2.setModelo("Uno");
		p2.setFabricante("Fiat");
		p2.setAno(2016);
		p2.setCor("Prata");
		p2.setChassis("88ii2-2322-2ll5i-25");
		p2.setQuilometragem(5000);
		p2.setValorDia(22.00);

		Popular p3 = new Popular();
		p3.setCodigoPopular(41003);
		p3.setModelo("Fiesta");
		p3.setFabricante("Ford");
		p3.setAno(2015);
		p3.setCor("Branco");
		p3.setChassis("kljn-1568-olk-256");
		p3.setQuilometragem(9000);
		p3.setValorDia(21.00);

		Popular p = new Popular();
		List<Popular> popular = new ArrayList<>();

		// insere cada veículo popular
		popular.add(p.cadastraVeiculoPopular(p1));
		popular.add(p.cadastraVeiculoPopular(p2));
		popular.add(p.cadastraVeiculoPopular(p3));

		// informações para alteração do veículo popular
		Popular p4 = new Popular();
		p4.setCodigoPopular(41003);
		p4.setModelo("Fiesta");
		p4.setFabricante("Ford");
		p4.setAno(2015);
		p4.setCor("Azul");
		p4.setChassis("kljn-1568-olk-256");
		p4.setQuilometragem(8000);
		p4.setValorDia(21.00);

		// altera veículo de luxo
		popular = p.alteraVeiculoPopular(popular, p4);

		int expected = 3;

		assertEquals(expected, popular.size());
		assertTrue(popular.contains(p1));
		assertTrue(popular.contains(p2));
		assertFalse(popular.contains(p3));
		assertTrue(popular.contains(p4));

	}

	@Test
	public void testRemoverVeiculoPopular() {

		// veiculos populares
		Popular p1 = new Popular();
		p1.setCodigoPopular(41001);
		p1.setModelo("Onix");
		p1.setFabricante("Chevrolet");
		p1.setAno(2015);
		p1.setCor("Preto");
		p1.setChassis("12-2322-jk-21");
		p1.setQuilometragem(10000);
		p1.setValorDia(25.00);

		Popular p2 = new Popular();
		p2.setCodigoPopular(41002);
		p2.setModelo("Uno");
		p2.setFabricante("Fiat");
		p2.setAno(2016);
		p2.setCor("Prata");
		p2.setChassis("88ii2-2322-2ll5i-25");
		p2.setQuilometragem(5000);
		p2.setValorDia(22.00);

		Popular p3 = new Popular();
		p3.setCodigoPopular(41003);
		p3.setModelo("Fiesta");
		p3.setFabricante("Ford");
		p3.setAno(2015);
		p3.setCor("Branco");
		p3.setChassis("kljn-1568-olk-256");
		p3.setQuilometragem(9000);
		p3.setValorDia(21.00);

		Popular p = new Popular();
		List<Popular> popular = new ArrayList<>();

		// insere cada veículo popular
		popular.add(p.cadastraVeiculoPopular(p1));
		popular.add(p.cadastraVeiculoPopular(p2));
		popular.add(p.cadastraVeiculoPopular(p3));

		int codpopular = 41003; // código do veículo popular a ser removido

		// remove veículo popular
		popular = p.removeVeiculoPopular(popular, codpopular);

		int expected = 2;

		assertEquals(expected, popular.size());
		assertTrue(popular.contains(p1));
		assertTrue(popular.contains(p2));
		assertFalse(popular.contains(p3));
	}

}
