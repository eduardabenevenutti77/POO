package prova_conexao_sql_java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroAutor extends Pessoas{
    private String email;
    private String nacionalidade;

    //método construtor da classe filho
    public CadastroAutor(String nome, String email, String nacionalidade){
        super(nome);
        this.email = email;
        this.nacionalidade = nacionalidade;
        
        try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuario", "root", "")) {
            try (PreparedStatement sc = connManager.prepareStatement("INSERT INTO usuario.usuario VALUES (?, ?, ?, ?)")){ 
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