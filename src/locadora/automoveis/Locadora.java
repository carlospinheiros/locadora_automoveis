package locadora.automoveis;

import java.util.List;

public class Locadora {

	private int codigoLocadora;
	private String estado;
	private String uf;
	private String telefone;
	private String endereco;
	private String cep;
	private String email;

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// cadastrar locadora
	public Locadora cadastraLocadora(Locadora locadora) {
		if (locadora.getCodigoLocadora() <= 0) {
			throw new ViolacaoCodigoLocadoraException("CÓDIGO NÃO PODE SER MENOR OU IGUAL A ZERO!");
		}
		return locadora;
	}

	// alterar as informações cadastradas do locadora
	public List<Locadora> alteraLocadora(List<Locadora> locadoras, Locadora locadora) {

		int cont = 0;

		for (Locadora l : locadoras) {
			if (l.getCodigoLocadora() == locadora.getCodigoLocadora()) {
				locadoras.remove(l);
				locadoras.add(locadora);
				cont++;
				break;
			}
		}
		if (cont == 0) {
			throw new LocadoraNaoAlteradaException("INFORMAÇÕES DA LOCADORA NÃO FORAM ALTERADAS!");
		}
		return locadoras;
	}

	// remover locadora
	public List<Locadora> removeLocadora(List<Locadora> locadoras, int codigoLocadora) {

		if (codigoLocadora <= 0) {
			throw new ViolacaoCodigoLocadoraException("CÓDIGO NÃO PODE SER MENOR OU IGUAL A ZERO!");
		} else {
			int tamanho = locadoras.size();

			for (Locadora c : locadoras) {
				if (c.getCodigoLocadora() == codigoLocadora) {
					locadoras.remove(c);
					break;
				}
			}
			if (locadoras.size() == tamanho) {
				throw new LocadoraNaoRemovidaException("CLIENTE NÃO REMOVIDO!");
			}
			return locadoras;
		}
	}

	@SuppressWarnings("serial")
	public class ViolacaoCodigoLocadoraException extends IllegalArgumentException {
		public ViolacaoCodigoLocadoraException(String msg) {
			super(msg);
		}
	}

	@SuppressWarnings("serial")
	public class LocadoraNaoAlteradaException extends IllegalArgumentException {
		public LocadoraNaoAlteradaException(String msg) {
			super(msg);
		}
	}

	@SuppressWarnings("serial")
	public class LocadoraNaoRemovidaException extends IllegalArgumentException {
		public LocadoraNaoRemovidaException(String msg) {
			super(msg);
		}
	}

}
