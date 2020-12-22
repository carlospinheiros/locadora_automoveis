package locadora.automoveis;

public class Reserva {

	private String codigoReserva;
	private int codigoLocadora;
	private String estado;
	private String uf;
	private int codigoCliente;
	private String nomeCliente;
	private String modelo;
	private String fabricante;

	public int getCodigoLocadora() {
		return codigoLocadora;
	}

	public void setCodigoLocadora(int codigoLocadora) {
		this.codigoLocadora = codigoLocadora;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getCodigoReserva() {
		return codigoReserva;
	}

	public void setCodigoReserva(String codigoReserva) {
		this.codigoReserva = codigoReserva;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
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

	// inserir reserva cliente
	public Reserva inserirReservaCliente(Reserva reserva, Locadora locadora, Automovel automovel, Cliente cliente) {
		if (reserva.getCodigoReserva() == null) {
			throw new ViolacaoCodigoReservaException("CÓDIGO NÃO PODE SER NULO OU BRANCO!");
		}
		reserva.setCodigoLocadora(locadora.getCodigoLocadora());
		reserva.setEstado(locadora.getEstado());
		reserva.setUf(locadora.getUf());
		reserva.setCodigoCliente(cliente.getCodigoCliente());
		reserva.setNomeCliente(cliente.getNome());
		reserva.setModelo(automovel.getModelo());
		reserva.setFabricante(automovel.getFabricante());
		return reserva;
	}

	// inserir reserva cliente vip
	public Reserva inserirReservaClienteVIP(Reserva reserva, Locadora locadora, Automovel automovel,
			ClienteVIP clienteVip) {
		if (reserva.getCodigoReserva() == null) {
			throw new ViolacaoCodigoReservaException("CÓDIGO NÃO PODE SER NULO OU BRANCO!");
		}
		reserva.setCodigoLocadora(locadora.getCodigoLocadora());
		reserva.setEstado(locadora.getEstado());
		reserva.setUf(locadora.getUf());
		reserva.setCodigoCliente(clienteVip.getCodigoClienteVIP());
		reserva.setNomeCliente(clienteVip.getNome());
		reserva.setModelo(automovel.getModelo());
		reserva.setFabricante(automovel.getFabricante());
		return reserva;
	}

	@SuppressWarnings("serial")
	public class ViolacaoCodigoReservaException extends IllegalArgumentException {
		public ViolacaoCodigoReservaException(String msg) {
			super(msg);
		}
	}

}
