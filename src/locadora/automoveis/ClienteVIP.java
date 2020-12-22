package locadora.automoveis;

import java.util.List;

public class ClienteVIP extends Pessoa{

	private int codigoClienteVIP;
	private double taxaDesconto;

	public int getCodigoClienteVIP() {
		return codigoClienteVIP;
	}

	public void setCodigoClienteVIP(int codigoClienteVIP) {
		this.codigoClienteVIP = codigoClienteVIP;
	}

	public double getTaxaDesconto() {
		return taxaDesconto;
	}

	public void setTaxaDesconto(double taxaDesconto) {
		this.taxaDesconto = taxaDesconto;
	}

	// cadastrar cliente
	public ClienteVIP cadastraClienteVIP(ClienteVIP cliente) {
		if (cliente.getCodigoClienteVIP() <= 0) {
			throw new ViolacaoCodigoClienteVIPException("CÓDIGO NÃO PODE SER MENOR OU IGUAL A ZERO!");
		}
		return cliente;
	}

	// alterar as informações cadastradas do cliente
	public List<ClienteVIP> alteraClienteVIP(List<ClienteVIP> clientes, ClienteVIP cliente) {

		int cont = 0;

		for (ClienteVIP c : clientes) {
			if (c.getCodigoClienteVIP() == cliente.getCodigoClienteVIP()) {
				clientes.remove(c);
				clientes.add(cliente);
				cont++;
				break;
			}
		}
		if (cont == 0) {
			throw new ClienteVIPNaoAlteradoException("INFORMAÇÕES DO CLIENTE NÃO FORAM ALTERADAS!");
		}
		return clientes;
	}

	// remover cliente
	public List<ClienteVIP> removeClienteVIP(List<ClienteVIP> clientes, int codigoCliente) {

		if (codigoCliente <= 0) {
			throw new ViolacaoCodigoClienteVIPException("CÓDIGO NÃO PODE SER MENOR OU IGUAL A ZERO!");
		} else {
			int tamanho = clientes.size();

			for (ClienteVIP c : clientes) {
				if (c.getCodigoClienteVIP() == codigoCliente) {
					clientes.remove(c);
					break;
				}
			}
			if (clientes.size() == tamanho) {
				throw new ClienteVIPNaoRemovidoException("CLIENTE NÃO REMOVIDO!");
			}
			return clientes;
		}
	}

	@SuppressWarnings("serial")
	public class ViolacaoCodigoClienteVIPException extends IllegalArgumentException {
		public ViolacaoCodigoClienteVIPException(String msg) {
			super(msg);
		}
	}

	@SuppressWarnings("serial")
	public class ClienteVIPNaoAlteradoException extends IllegalArgumentException {
		public ClienteVIPNaoAlteradoException(String msg) {
			super(msg);
		}
	}

	@SuppressWarnings("serial")
	public class ClienteVIPNaoRemovidoException extends IllegalArgumentException {
		public ClienteVIPNaoRemovidoException(String msg) {
			super(msg);
		}
	}

}
