package br.com.step.jdbc.teste;

import java.util.Calendar;

import br.com.step.jdbc.dao.ContatoDAO;
import br.com.step.jdbc.modelo.Contato;

public class TestaAlteracao {

	public static void main(String[] args) {

		ContatoDAO dao = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("Java Programação");
		contato.setTelefone(" (021) - 98179-0560 ");
		contato.setEmail("curso@step.com.br");
		contato.setDataCadastrado(Calendar.getInstance());
		contato.setObservacao("Dados alterados por mudança de usuario.");
		contato.setId(2L);
		
		dao.altera(contato);
		System.out.println("Dados alterado com sucesso.");
	}

}
