package locadora.automoveis;

import java.util.List;

public class Cliente extends Pessoa {

	private int codigoCliente;

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	// cadastrar cliente
	public Cliente cadastraCliente(Cliente cliente) {
		if (cliente.getCodigoCliente() <= 0) {
			throw new ViolacaoCodigoClienteException("CÓDIGO NÃO PODE SER MENOR OU IGUAL A ZERO!");
		}
		return cliente;
	}

	// alterar as informações cadastradas do cliente
	public List<Cliente> alteraCliente(List<Cliente> clientes, Cliente cliente) {

		int cont = 0;

		for (Cliente c : clientes) {
			if (c.getCodigoCliente() == cliente.getCodigoCliente()) {
				clientes.remove(c);
				clientes.add(cliente);
				cont++;
				break;
			}
		}
		if (cont == 0) {
			throw new ClienteNaoAlteradoException("INFORMAÇÕES DO CLIENTE NÃO FORAM ALTERADAS!");
		}
		return clientes;
	}

	// remover cliente
	public List<Cliente> removeCliente(List<Cliente> clientes, int codigoCliente) {

		if (codigoCliente <= 0) {
			throw new ViolacaoCodigoClienteException("CÓDIGO NÃO PODE SER MENOR OU IGUAL A ZERO!");
		} else {
			int tamanho = clientes.size();

			for (Cliente c : clientes) {
				if (c.getCodigoCliente() == codigoCliente) {
					clientes.remove(c);
					break;
				}
			}
			if (clientes.size() == tamanho) {
				throw new ClienteNaoRemovidoException("CLIENTE NÃO REMOVIDO!");
			}
			return clientes;
		}
	}

	@SuppressWarnings("serial")
	public class ViolacaoCodigoClienteException extends IllegalArgumentException {
		public ViolacaoCodigoClienteException(String msg) {
			super(msg);
		}
	}

	@SuppressWarnings("serial")
	public class ClienteNaoAlteradoException extends IllegalArgumentException {
		public ClienteNaoAlteradoException(String msg) {
			super(msg);
		}
	}

	@SuppressWarnings("serial")
	public class ClienteNaoRemovidoException extends IllegalArgumentException {
		public ClienteNaoRemovidoException(String msg) {
			super(msg);
		}
	}

}
