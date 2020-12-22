package locadora.automoveis;

public class Pagamento {

	private double valorAluguel;

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	// efetuar pagamento cheque
	public boolean efetuarPagamentoCheque(Cheque cheque) {
		if (cheque.getBanco() == null || cheque.getAgencia() == null || cheque.getConta() == null
				|| cheque.getNumeroCheque() == null) {
			return false;
		}
		return true;
	}

	// efetuar pagamento cartao
	public boolean efetuarPagamentoCartao(Cartao cartao) {
		if (cartao.getBanco() == null || cartao.getAgencia() == null || cartao.getConta() == null
				|| cartao.getNumeroCartao() == null) {
			return false;
		}
		return true;
	}

	// efetuar pagamento dinheiro
	public boolean efetuarPagamentoDinheiro() {
		return true;
	}

}
