package locadora.automoveis;

import java.util.List;

public class Funcionario extends Pessoa {

	private int codigoFuncionario;

	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	// cadastrar funcionário
	public Funcionario cadastraFuncionario(Funcionario funcionario) {
		if (funcionario.getCodigoFuncionario() <= 0) {
			throw new ViolacaoCodigoFuncionarioException("CÓDIGO NÃO PODE SER MENOR OU IGUAL A ZERO!");
		}
		return funcionario;
	}

	// alterar informações cadastradas do funcionário
	public List<Funcionario> alteraFuncionario(List<Funcionario> funcionarios, Funcionario funcionario) {

		int cont = 0;

		for (Funcionario f : funcionarios) {
			if (f.getCodigoFuncionario() == funcionario.getCodigoFuncionario()) {
				funcionarios.remove(f);
				funcionarios.add(funcionario);
				cont++;
				break;
			}
		}
		if (cont == 0) {
			throw new FuncionarioNaoAlteradoException("INFORMAÇÕES DO FUNCIONÁRIO NÃO FORAM ALTERADAS!");
		}
		return funcionarios;
	}

	// remover funcionário
	public List<Funcionario> removeFuncionario(List<Funcionario> funcionarios, int codigoFuncionario) {

		if (codigoFuncionario <= 0) {
			throw new ViolacaoCodigoFuncionarioException("CÓDIGO NÃO PODE SER MENOR OU IGUAL A ZERO!");
		} else {

			int tamanho = funcionarios.size();

			for (Funcionario f : funcionarios) {
				if (f.getCodigoFuncionario() == codigoFuncionario) {
					funcionarios.remove(f);
					break;
				}
			}
			if (funcionarios.size() == tamanho) {
				throw new FuncionarioNaoRemovidoException("FUNCIONÁRIO NÃO REMOVIDO!");
			}
			return funcionarios;
		}
	}

	@SuppressWarnings("serial")
	public class ViolacaoCodigoFuncionarioException extends IllegalArgumentException {
		public ViolacaoCodigoFuncionarioException(String msg) {
			super(msg);
		}
	}

	@SuppressWarnings("serial")
	public class FuncionarioNaoAlteradoException extends IllegalArgumentException {
		public FuncionarioNaoAlteradoException(String msg) {
			super(msg);
		}
	}

	@SuppressWarnings("serial")
	public class FuncionarioNaoRemovidoException extends IllegalArgumentException {
		public FuncionarioNaoRemovidoException(String msg) {
			super(msg);
		}
	}

}
