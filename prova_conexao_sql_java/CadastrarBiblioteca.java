package prova_conexao_sql_java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastrarBiblioteca {
    private String nomeBiblioteca;

    //método construtor da classe
    public CadastrarBiblioteca(String nomeBiblioteca){
        this.nomeBiblioteca = nomeBiblioteca;
        
        try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova_java_sql", "root", "")) {
            try (PreparedStatement sc = connManager.prepareStatement("INSERT INTO prova_java_sql.cadastrarbiblioteca VALUES (?, ?)")){ 
                sc.setLong(1, 0); 
                sc.setString(2, this.nomeBiblioteca);
                sc.executeUpdate();
                System.out.println("Usuário cadastrado com sucesso!");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao cadastrar usuário: " + exception.getMessage());
        }
    }
    //agrupamento de set's e get's 
    public void setNomeBiblioteca(String nomeBiblioteca){
        this.nomeBiblioteca = nomeBiblioteca;
    }
    public String getNomeBiblioteca(){
        return this.nomeBiblioteca;
    }
    public String getMidia(){
        return this.getMidia();
    }
    public String getTitulo(){
        return this.getTitulo();
    }
    public String getEmail(){
        return this.getEmail();
    }
    public String getDigital(){
        return this.getDigital();
    }
}
