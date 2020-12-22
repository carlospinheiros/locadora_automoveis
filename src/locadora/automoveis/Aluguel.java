package locadora.automoveis;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluguel {

	private String dataSaida;
	private String dataEntrega;

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	// calcular valor do aluguel para cliente diaria
	public double calcularAluguelClienteDiaria(Aluguel datas, Automovel automovel) throws ParseException {

		double valorAluguel;

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Date dtInicial = df.parse(datas.getDataSaida());
		Date dtFinal = df.parse(datas.getDataEntrega());

		long dias = (dtFinal.getTime() - dtInicial.getTime() + 3600000L) / 86400000L;

		valorAluguel = dias * automovel.getValorDia();

		if (valorAluguel <= 0) {
			throw new ViolacaoValorAluguelException("VALOR DO ALUGUEL NÃO PODE SER MENOR OU IGUAL A ZERO!");
		}

		return valorAluguel;
	}

	// calcular valor do aluguel para clienteVIP diaria
	public double calcularAluguelClienteVIPDiaria(Aluguel datas, ClienteVIP clienteVip, Automovel automovel) throws ParseException {
		
		double valorAluguel;

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Date dtInicial = df.parse(datas.getDataSaida());
		Date dtFinal = df.parse(datas.getDataEntrega());

		long dias = (dtFinal.getTime() - dtInicial.getTime() + 3600000L) / 86400000L;

		valorAluguel = dias * automovel.getValorDia() - clienteVip.getTaxaDesconto();

		if (valorAluguel <= 0) {
			throw new ViolacaoValorAluguelException("VALOR DO ALUGUEL NÃO PODE SER MENOR OU IGUAL A ZERO!");
		}

		return valorAluguel;
	}

	@SuppressWarnings("serial")
	public class ViolacaoValorAluguelException extends IllegalArgumentException {
		public ViolacaoValorAluguelException(String msg) {
			super(msg);
		}
	}

}
