package br.com.step.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.step.jdbc.Factory.ConnectionFactory;
import br.com.step.jdbc.modelo.Contato;

public class ContatoDAO {

	private Connection conn ;
	
	public ContatoDAO(){
		this.conn = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Contato contato ) {
		String sql = " INSERT INTO CONTATO (nome, telefone, email, dt_cad, obs) values( ?, ?, ?, ? , ? ) ";
		
		try{
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			//seta os valores
			pstmt.setString(1, contato.getNome());
			pstmt.setString(2, contato.getTelefone());
			pstmt.setString(3,contato.getEmail());
			pstmt.setDate(4, new Date ( contato.getDataCadastrado().getTimeInMillis()) );
			pstmt.setString(5, contato.getObservacao());
			
			pstmt.execute();
			pstmt.close();
		} catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public List<Contato> getList(){
		
		try{
			List<Contato> contatos = new ArrayList<Contato>();
			PreparedStatement pstmt = this.conn.prepareStatement(" select * from contato ");
			ResultSet rs = pstmt.executeQuery();
			
			
			while(rs.next()){
				//Criando o objeto Contato
				Contato contato = new Contato();
				contato.setNome(rs.getString("nome"));
				contato.setTelefone(rs.getString("telefone"));
				contato.setEmail(rs.getString("email"));

				// Montando a Data atraves do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dt_cad"));
				contato.setDataCadastrado(data);

				//adicionar o objeto a lista
				contatos.add(contato);
			}

			rs.close();
			pstmt.close();
			
			return contatos;
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
				
	}
	
	
	public void altera(Contato contato){
		
		String update = " UPDATE CONTATO SET nome = ? , telefone = ?, email = ?, dt_cad = ? , obs = ? where codigo = ? ";
		
		try{
			PreparedStatement pstmt = conn.prepareStatement(update);
			pstmt.setString(1, contato.getNome());
			pstmt.setString(2, contato.getTelefone());
			pstmt.setString(3, contato.getEmail());
			pstmt.setDate(4, new Date(contato.getDataCadastrado().getTimeInMillis()));
			pstmt.setString(5, contato.getObservacao());
			pstmt.setLong(6, contato.getId());
			pstmt.execute();
			pstmt.close();
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	
	public void remover (Contato contato) {
		
		try{
			PreparedStatement pstmt = conn.prepareStatement(" delete from contato where codigo = ? ");
			pstmt.setLong(1, contato.getId());
			pstmt.execute();
			pstmt.close();
			
			System.out.println("Dados excluído com sucesso");
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}
