package locadora.automoveis;

public class NotaFiscal {

	private String nomeCliente;
	private String cpf;
	private int codigoVeiculo;
	private String modelo;
	private String fabricante;
	private double valorAluguel;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getCodigoVeiculo() {
		return codigoVeiculo;
	}

	public void setCodveiculo(int codigoVeiculo) {
		this.codigoVeiculo = codigoVeiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	// emitir Nota Fiscal
	public NotaFiscal emitirNotaFiscal(NotaFiscal notafiscal) {
		return notafiscal;
	}

}
