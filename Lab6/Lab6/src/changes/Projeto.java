package changes;

import java.util.List;

public class Projeto {

	/**
	 * Mudanca no acesso do atributo
	 */
	private int d;

	public Projeto(int d) {
		this.d = d;
	}

	public boolean isEntregue() {
		return false;
	}

	public List<Cliente> getClientes() {
		return null;
	}

	public String avisaAtraso() {
		List<Cliente> clients = this.getClientes();
		for (Cliente c : clients) {
			c.avisaAtraso(this.getD());
		}
		return "Projeto atrasado";
	}

	// Nome do metodo mais autoexplicativo
	public String checaPrazo() {
		// verifica prazo do projeto
		if (this.getD() < 90) {
			// verifica se projeto ainda está em andamento
			if (!this.isEntregue()) {
				// projeto ainda em andamento e com prazo curto para entrega
				return "Projeto está apertado";
			} else {
				return "Projeto entregue";
			}
		} else {
			return this.avisaAtraso();
		}
	}

	public int getD() {
		return this.d;
	}

}
