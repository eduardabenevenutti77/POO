package prova_conexao_sql_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastrarEditora extends Empresa {
    private String email_contato; 

    
    //método construtor da classe filho
    public CadastrarEditora(int cnpj,String nomeEditora,  String email_contato) {
        super(cnpj, nomeEditora);
        this.email_contato = email_contato;
       
         try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova_java_sql", "root", "")) {
            try (PreparedStatement sc = connManager.prepareStatement("INSERT INTO prova_java_sql.cadastrareditora VALUES (?, ?)")){ 
                sc.setLong(1, 0); 
                sc.setString(2, this.email_contato);
                sc.executeUpdate();
                System.out.println("Editora cadastrada com sucesso!");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao cadastrar editora: " + exception.getMessage());
        }
    }
    //criação do método set e get
    public void setEmail_contato(String email_contrato){
        this.email_contato = email_contrato;
    }
    public String getEmail_contato(String email_contato){
        return this.email_contato;
    }
    //método toString da classe filho
    public String toString(){
        return super.nomeEditora.toString()+", cnpj: "+super.getCnpj()+"& e-mail: "+this.email_contato;
    }
}