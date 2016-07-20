package br.com.step.jdbc.teste;

import br.com.step.jdbc.dao.ContatoDAO;
import br.com.step.jdbc.modelo.Contato;

public class TesteDelete {

	public static void main(String[] args) {

		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();

		contato.setId(2L);
		dao.remover(contato);
		
		
	}

}
