package prova_conexao_sql_java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastroLivro extends CadastrarClassificacao {
    private String tituloLivro;
    private CadastroAutor nome;
    private int numeroINNS;
    private boolean disponibilidade;

    
    //método construtor da classe
    public CadastroLivro(String tituloLivro, CadastroAutor nome, boolean disponibilidade, int numeroINNS, String classificacao) {
        super(classificacao); 
        this.tituloLivro = tituloLivro;
        this.nome = nome;
        this.numeroINNS = numeroINNS;
        this.disponibilidade = disponibilidade;
        
        try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova_java_sql", "root", "")) {
            try (PreparedStatement sc = connManager.prepareStatement("INSERT INTO prova_java_sql.cadastrarlivro VALUES (?, ?, ?, ?)")){ 
                sc.setLong(1, 0); 
                sc.setString(2, this.tituloLivro);
                sc.setInt(3, this.numeroINNS);
                sc.setBoolean(4, this.disponibilidade);
                sc.executeUpdate();
                System.out.println("Livro cadastrado com sucesso!");
            }
        } catch (SQLException exception) {
             System.out.println("Erro ao cadastrar livro: " + exception.getMessage());
        }
    }

    public static void listarLivro(){
  try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova_java_sql", "root", "")){
      try (PreparedStatement sc = connManager.prepareStatement("SELECT id_livro, tituloLivro, numeroINNS, id_editora, idAutor, id_biblioteca, id_classifi FROM prova_java_sql.cadastrarlivro")){ 
          try(ResultSet ra = sc.executeQuery()){
              if(ra.next()){
                  long id = ra.getLong(0);
                  String titulo = ra.getString(1);
                  Integer numero = ra.getInt(2);
                  Integer id_editora = ra.getInt(3);
                  Integer idAutor = ra.getInt(4);
                  Integer id_biblioteca = ra.getInt(5);
                  Integer id_classifi = ra.getInt(6);
                  System.out.println("ID: "+id+"\n Título do Livro: "+titulo+"\n Número do Livro: "+numero+"\n ID Editora: "+id_editora+"\n ID Autor: "+idAutor+"\n ID Biblioteca"+id_biblioteca+"\nID Classificação: "+id_classifi);
              }
          }
      }
    }catch (SQLException exception){
        System.out.println("Erro ao listar mídia digital: "+exception.getMessage());
    }
    }
    //agrupamento de set's e get's
    public void setTitulo(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }
    public String getTitulo() {
        return this.tituloLivro;
    }
    public void setNumeroINNS(int numeroINNS) {
        this.numeroINNS = numeroINNS;
    }
    public int getNumeroINNS() {
        return this.numeroINNS;
    }
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    public boolean getDisponibilidade(){
        return this.disponibilidade;
    }
    //método de emprestar e devolver livro
    public void emprestarLivros() throws Exception {
        if (!this.disponibilidade) {
            throw new Exception("O livro não está disponível para alocação");
        }
        this.disponibilidade = false;
    }
    public void devolverLivro() throws Exception {
        if (this.disponibilidade) {
            throw new Exception("O livro está disponível para alocação");
        }
        this.disponibilidade = true;
    }
    //método toString da classe
    public String toString() {
        return "\n\tListagem de Livros\nNome do Livro = " + this.tituloLivro +
               "\nNome do Autor = " + this.nome + // Use um atributo específico do autor
               "\nDisponível: " + this.disponibilidade +
               "\n Número do INNS = " + this.numeroINNS +
               "& Classificação = " + super.classificacao;
    }
}
