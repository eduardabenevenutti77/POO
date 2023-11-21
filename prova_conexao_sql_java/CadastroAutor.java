package prova_conexao_sql_java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastroAutor extends Pessoas{
    private String email;
    private String nacionalidade;

    //método construtor da classe filho
    public CadastroAutor(String nome, String email, String nacionalidade){
        super(nome);
        this.email = email;
        this.nacionalidade = nacionalidade;
        
        try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova_java_sql", "root", "")) {
            try (PreparedStatement sc = connManager.prepareStatement("INSERT INTO prova_java_sql.cadastrarautor VALUES (?, ?, ?, ?)")){ 
                sc.setLong(1, 0); 
                sc.setString(2, this.nome);
                sc.setString(3, this.email);
                sc.setString(4, this.nacionalidade);
                sc.executeUpdate();
                System.out.println("Usuário cadastrado com sucesso!");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao cadastrar usuário: " + exception.getMessage());
        }
    }

     public static void listarAutor(){
     try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova_java_sql", "root", "")){
         try (PreparedStatement sc = connManager.prepareStatement("SELECT idAutor, nome_autor, email, nacionalidade FROM prova_java_sql.cadastrarautor")){
             try(ResultSet ra = sc.executeQuery()){
                 if(ra.next()){
                     long id = ra.getLong(0);
                     String nome = ra.getString(1);
                     String email = ra.getString(2);
                     String nacionalidade = ra.getString(3);
                     System.out.println("ID: "+id+"\n Nome do autor: "+nome+"\nE-mail do autor: "+email+"\nNacionalidade do autor: "+nacionalidade);
                 }
             }
         }
     }catch (SQLException exception){
         System.out.println("Erro ao listar autores: "+exception.getMessage());
        }
     }
    //agrupamento de set's e get's 
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    //método toString()
    public String toString(){
        return "\n\tListagem de Autores"+super.nome.toString()+"\n E-mail: "+this.email+"\n Nacionalidade: "+this.nacionalidade;
    }
}