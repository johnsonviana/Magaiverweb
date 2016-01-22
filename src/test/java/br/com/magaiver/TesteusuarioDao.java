package br.com.magaiver;

import br.com.magaiver.persistencia.entidade.Usuario;
import br.com.magaiver.persistencia.jdbc.UsuarioDAO;

public class TesteusuarioDao {

	public static void main(String[] args) {
		testExcluir();
		
	}
	
	public static void testExcluir(){
		  
		  Usuario usu = new Usuario();
			//criando usuario
          usu.setId(1); 		  
		
			// cadastrando usuario
			UsuarioDAO usuDAO = new UsuarioDAO();
	      usuDAO.excluir(usu);
	      
	      System.out.println("Excluido com Sucesso");
	  }
	
	public static void testAlterar(){
		  
		  Usuario usu = new Usuario();
			//criando usuario
            usu.setId(1); 		  
			usu.setNome("gipsads");
			usu.setLogin("gipaoss");
			usu.setSenha("Defcom0q4");
			// cadastrando usuario
			UsuarioDAO usuDAO = new UsuarioDAO();
	      usuDAO.alterar(usu);
	      
	      System.out.println("alterado com Sucesso");
	  }
	
  public static void testCadastrar(){
	  
	  Usuario usu = new Usuario();
		//criando usuario
		usu.setNome("gips");
		usu.setLogin("gipao");
		usu.setSenha("Defcom04");
		// cadastrando usuario
		UsuarioDAO usuDAO = new UsuarioDAO();
      usuDAO.cadastrar(usu);
      
      System.out.println("cadastrado com Sucesso");
  }
}
