package br.com.step.jdbc.teste;

import java.util.Calendar;

import br.com.step.jdbc.dao.ContatoDAO;
import br.com.step.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// pronto pra gravar
		
		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();
		contato.setNome("Curso Step");
		contato.setTelefone(" (021) - xxxx - xxxx ");
		contato.setEmail("step@step.com.br");
		contato.setDataCadastrado(Calendar.getInstance());
				
		//metodo
		dao.adiciona(contato);
		System.out.println("Registro salvo com sucesso! ");
		
	}

}
