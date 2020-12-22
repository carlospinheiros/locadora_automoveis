package locadora.automoveis;

import java.util.List;

public class Utilitario extends Automovel {

	private int codigoUtilitario;

	public int getCodigoUtilitario() {
		return codigoUtilitario;
	}

	public void setCodigoUtilitario(int codigoUtilitario) {
		this.codigoUtilitario = codigoUtilitario;
	}

	// cadastrar ve�culo utilit�rio
	public Utilitario cadastraVeiculoUtilitario(Utilitario utilitario) {
		if (utilitario.getCodigoUtilitario() <= 0) {
			throw new ViolacaoCodigoVeiculoUtilitarioException("C�DIGO N�O PODE SER MENOR OU IGUAL A ZERO!");
		}
		return utilitario;
	}

	// alterar as informa��es cadastradas do ve�culo utilitario
	public List<Utilitario> alteraVeiculoUtilitario(List<Utilitario> utilitarios, Utilitario utilitario) {

		int cont = 0;

		for (Utilitario u : utilitarios) {
			if (u.getCodigoUtilitario() == utilitario.getCodigoUtilitario()) {
				utilitarios.remove(u);
				utilitarios.add(utilitario);
				cont++;
				break;
			}
		}
		if (cont == 0) {
			throw new VeiculoUtilitarioNaoAlteradoException("INFORMA��ES DO VE�CULO UTILIT�RIO N�O FORAM ALTERADOS!");
		}
		return utilitarios;
	}

	// remover ve�culo utilit�rio
	public List<Utilitario> removeVeiculoUtilitario(List<Utilitario> utilitarios, int codigoUtilitario) {

		if (codigoUtilitario <= 0) {
			throw new ViolacaoCodigoVeiculoUtilitarioException("C�DIGO N�O PODE SER MENOR OU IGUAL A ZERO!");
		} else {
			int tamanho = utilitarios.size();

			for (Utilitario u : utilitarios) {
				if (u.getCodigoUtilitario() == codigoUtilitario) {
					utilitarios.remove(u);
					break;
				}
			}
			if (utilitarios.size() == tamanho) {
				throw new VeiculoUtilitarioNaoRemovidoException("VE�CULO UTILIT�RIO N�O REMOVIDO!");
			}
			return utilitarios;
		}
	}

	@SuppressWarnings("serial")
	public class ViolacaoCodigoVeiculoUtilitarioException extends IllegalArgumentException {
		public ViolacaoCodigoVeiculoUtilitarioException(String msg) {
			super(msg);
		}
	}

	@SuppressWarnings("serial")
	public class VeiculoUtilitarioNaoAlteradoException extends IllegalArgumentException {
		public VeiculoUtilitarioNaoAlteradoException(String msg) {
			super(msg);
		}
	}

	@SuppressWarnings("serial")
	public class VeiculoUtilitarioNaoRemovidoException extends IllegalArgumentException {
		public VeiculoUtilitarioNaoRemovidoException(String msg) {
			super(msg);
		}
	}

}
