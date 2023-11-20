package prova_conexao_sql_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastrarClassificacao {
    protected String classificacao;

    // método construtor da classe pai
    public CadastrarClassificacao(String classificacao) {
        this.classificacao = classificacao;
        
        try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova_java_sql", "root", "")) {
            try (PreparedStatement sc = connManager.prepareStatement("INSERT INTO prova_java_sql.cadastrarclassificacao VALUES (?, ?)")){ 
                sc.setLong(1, 0); 
                sc.setString(2, this.classificacao);
                sc.executeUpdate();
                System.out.println("Classificação cadastrada com sucesso!");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao cadastrar classificação: " + exception.getMessage());
        }

        try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova_java_sql", "root", "")){
            try {
                PreparedStatement sc = connManager.prepareStatement("SELECT * FROM prova_java_sql.cadastrarclassificacao");
                sc.setLong(1, 0); 
                sc.setString(2, this.classificacao);
                sc.executeUpdate();
                System.out.println("Classificação listada com sucesso!");
            } catch (SQLException e){
            }
        }catch (SQLException exception){
            System.out.println("Erro ao listar classificação: "+exception.getMessage());
        }
    }

    // agrupamento de set's e get's
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getClassificacao() {
        return this.classificacao;
    }

    // método toString()
    public String toString() {
        return "\n\tListagem de Classificação: " + this.classificacao;
    }
}
