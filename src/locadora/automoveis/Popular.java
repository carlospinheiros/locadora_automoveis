package locadora.automoveis;

import java.util.List;

public class Popular extends Automovel {

	private int codigoPopular;

	public int getCodigoPopular() {
		return codigoPopular;
	}

	public void setCodigoPopular(int codigoPopular) {
		this.codigoPopular = codigoPopular;
	}

	// cadastrar ve�culo popular
	public Popular cadastraVeiculoPopular(Popular popular) {
		if (popular.getCodigoPopular() <= 0) {
			throw new ViolacaoCodigoVeiculoPopularException("C�DIGO N�O PODE SER MENOR OU IGUAL A ZERO!");
		}
		return popular;
	}

	// alterar as informa��es cadastradas do ve�culo popular
	public List<Popular> alteraVeiculoPopular(List<Popular> populares, Popular popular) {

		int cont = 0;

		for (Popular p : populares) {
			if (p.getCodigoPopular() == popular.getCodigoPopular()) {
				populares.remove(p);
				populares.add(popular);
				cont++;
				break;
			}
		}
		if (cont == 0) {
			throw new VeiculoPopularNaoAlteradoException("INFORMA��ES DO VE�CULO POPULAR N�O FORAM ALTERADOS!");
		}
		return populares;
	}

	// remover ve�culo popular
	public List<Popular> removeVeiculoPopular(List<Popular> populares, int codigoPopular) {

		if (codigoPopular <= 0) {
			throw new ViolacaoCodigoVeiculoPopularException("C�DIGO N�O PODE SER MENOR OU IGUAL A ZERO!");
		} else {
			int tamanho = populares.size();

			for (Popular p : populares) {
				if (p.getCodigoPopular() == codigoPopular) {
					populares.remove(p);
					break;
				}
			}
			if (populares.size() == tamanho) {
				throw new VeiculoPopularNaoRemovidoException("VE�CULO POPULAR N�O REMOVIDO!");
			}
			return populares;
		}
	}

	@SuppressWarnings("serial")
	public class ViolacaoCodigoVeiculoPopularException extends IllegalArgumentException {
		public ViolacaoCodigoVeiculoPopularException(String msg) {
			super(msg);
		}
	}

	@SuppressWarnings("serial")
	public class VeiculoPopularNaoAlteradoException extends IllegalArgumentException {
		public VeiculoPopularNaoAlteradoException(String msg) {
			super(msg);
		}
	}

	@SuppressWarnings("serial")
	public class VeiculoPopularNaoRemovidoException extends IllegalArgumentException {
		public VeiculoPopularNaoRemovidoException(String msg) {
			super(msg);
		}
	}

}
