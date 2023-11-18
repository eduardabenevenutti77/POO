package prova_conexao_sql_java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CadastrarClassificacao {
    protected String classificacao;   

    //método construtor da classe pai
    public CadastrarClassificacao(String classificacao) {
        this.classificacao = classificacao;
        
        try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova_java_sql", "root", "")) {
            try (PreparedStatement sc = connManager.prepareStatement("INSERT INTO prova_java_sql.cadastrarclassificacao VALUES (?, ?, ?, ?)")){ 
                sc.setLong(1, 0); 
                sc.setString(2, this.classificacao);
                sc.executeUpdate();
                System.out.println("Usuário cadastrado com sucesso!");
            }
        } catch (SQLException exception) {
    System.out.println("Erro ao cadastrar usuário: " + exception.getMessage());
}
    }
    //agrupamento de set's e get's
    public void setClassificacao(String classificacao){
        this.classificacao = classificacao;
    }
    public String getClassificacao(){
        return this.classificacao;
    }
    //método toString()
    public String toString() {
        return "\n\tListagem de Classificação: " + this.classificacao;
    }    
}
