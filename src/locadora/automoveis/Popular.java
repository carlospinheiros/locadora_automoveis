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

	// cadastrar veículo popular
	public Popular cadastraVeiculoPopular(Popular popular) {
		if (popular.getCodigoPopular() <= 0) {
			throw new ViolacaoCodigoVeiculoPopularException("CÓDIGO NÃO PODE SER MENOR OU IGUAL A ZERO!");
		}
		return popular;
	}

	// alterar as informações cadastradas do veículo popular
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
			throw new VeiculoPopularNaoAlteradoException("INFORMAÇÕES DO VEÍCULO POPULAR NÃO FORAM ALTERADOS!");
		}
		return populares;
	}

	// remover veículo popular
	public List<Popular> removeVeiculoPopular(List<Popular> populares, int codigoPopular) {

		if (codigoPopular <= 0) {
			throw new ViolacaoCodigoVeiculoPopularException("CÓDIGO NÃO PODE SER MENOR OU IGUAL A ZERO!");
		} else {
			int tamanho = populares.size();

			for (Popular p : populares) {
				if (p.getCodigoPopular() == codigoPopular) {
					populares.remove(p);
					break;
				}
			}
			if (populares.size() == tamanho) {
				throw new VeiculoPopularNaoRemovidoException("VEÍCULO POPULAR NÃO REMOVIDO!");
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
