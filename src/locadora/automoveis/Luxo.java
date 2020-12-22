package locadora.automoveis;

import java.util.List;

public class Luxo extends Automovel {

	private int codigoLuxo;

	public int getCodigoLuxo() {
		return codigoLuxo;
	}

	public void setCodigoLuxo(int codigoLuxo) {
		this.codigoLuxo = codigoLuxo;
	}

	// cadastrar veículo de luxo
	public Luxo cadastraVeiculoLuxo(Luxo lx) {
		if (lx.getCodigoLuxo() <= 0) {
			throw new ViolacaoCodigoVeiculoLuxoException("CÓDIGO NÃO PODE SER MENOR OU IGUAL A ZERO!");
		}
		return lx;
	}

	// alterar as informações cadastradas do veículo de luxo
	public List<Luxo> alteraVeiculoLuxo(List<Luxo> luxo, Luxo lx) {

		int cont = 0;

		for (Luxo l : luxo) {
			if (l.getCodigoLuxo() == lx.getCodigoLuxo()) {
				luxo.remove(l);
				luxo.add(lx);
				cont++;
				break;
			}
		}
		if (cont == 0) {
			throw new VeiculoLuxoNaoAlteradoException("INFORMAÇÕES DO VEÍCULO DE LUXO NÃO FORAM ALTERADOS!");
		}
		return luxo;
	}

	// remover veículo de luxo
	public List<Luxo> removeVeiculoLuxo(List<Luxo> luxo, int codigoLuxo) {

		if (codigoLuxo <= 0) {
			throw new ViolacaoCodigoVeiculoLuxoException("CÓDIGO NÃO PODE SER MENOR OU IGUAL A ZERO!");
		} else {
			int tamanho = luxo.size();

			for (Luxo l : luxo) {
				if (l.getCodigoLuxo() == codigoLuxo) {
					luxo.remove(l);
					break;
				}
			}
			if (luxo.size() == tamanho) {
				throw new VeiculoLuxoNaoRemovidoException("VEÍCULO DE LUXO NÃO REMOVIDO!");
			}
			return luxo;
		}
	}

	@SuppressWarnings("serial")
	public class ViolacaoCodigoVeiculoLuxoException extends IllegalArgumentException {
		public ViolacaoCodigoVeiculoLuxoException(String msg) {
			super(msg);
		}
	}

	@SuppressWarnings("serial")
	public class VeiculoLuxoNaoAlteradoException extends IllegalArgumentException {
		public VeiculoLuxoNaoAlteradoException(String msg) {
			super(msg);
		}
	}

	@SuppressWarnings("serial")
	public class VeiculoLuxoNaoRemovidoException extends IllegalArgumentException {
		public VeiculoLuxoNaoRemovidoException(String msg) {
			super(msg);
		}
	}

}
