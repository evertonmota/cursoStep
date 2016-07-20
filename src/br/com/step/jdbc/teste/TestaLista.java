package br.com.step.jdbc.teste;

import java.util.List;

import br.com.step.jdbc.dao.ContatoDAO;
import br.com.step.jdbc.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = dao.getList();
		
		
		System.out.println(" ------------------------------ LISTAGEM DE ALUNOS DE JAVA ------------------------------");
		for (Contato contato : contatos){
			
			System.out.println(" Nome : " + contato.getNome());
			System.out.println(" Telefone : " + contato.getTelefone());
			System.out.println(" Email : "+ contato.getEmail());
			System.out.println(" Data de Cadastro : " + contato.getDataCadastrado().getTime());
			System.out.println(" Observação : " + contato.getObservacao() + "\n");
		}
		
		System.out.println("------------------------------ Fim ------------------------------");
	}

}
