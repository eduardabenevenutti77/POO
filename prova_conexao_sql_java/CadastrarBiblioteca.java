package prova_conexao_sql_java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class CadastrarBiblioteca {
    private String nomeBiblioteca;
    public  ArrayList<CadastroLivro> livros;
    public  ArrayList<CadastrarEditora> editoras;
    public ArrayList<CadastrarMidia> midias;
    public ArrayList<CadastrarMidiaDigital> digitais;

    //método construtor da classe
    public CadastrarBiblioteca(String nomeBiblioteca){
        this.nomeBiblioteca = nomeBiblioteca;
        this.livros = new ArrayList<CadastroLivro>();
        this.midias = new ArrayList<CadastrarMidia>();
        this.editoras = new ArrayList<CadastrarEditora>();
        this.digitais = new ArrayList<CadastrarMidiaDigital>();
        
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
    //incluido livro, mídia e mídia digital
     public void incluirLivro(CadastroLivro livro) {
        livros.add(livro);
    }
    public void incluirMidia(CadastrarMidia midia){
        midias.add(midia);
    }
    public void incluirDigital(CadastrarMidiaDigital digital){
        digitais.add(digital);
    }
    //método toString()
    public String toString(){
        return "\n\tListagem de Bibliotecas: \nNome da Biblioteca: "+
        this.getNomeBiblioteca()+"\nNome do Livro: "+this.getTitulo()+
        "\nNome da Editora"+this.getEmail()+"\nNome Mídia: "+this.getMidia()+
        "& Mídia Digital: "+this.getDigital();
    }
}
