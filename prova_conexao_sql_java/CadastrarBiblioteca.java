package prova_conexao_sql_java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
                System.out.println("Biblioteca cadastrado com sucesso!");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao cadastrar biblioteca: " + exception.getMessage());
        }

        try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova_java_sql", "root", "")){
            try (PreparedStatement sc = connManager.prepareStatement("SELECT * FROM prova_java_sql.cadastrarbiblioteca")){
                sc.setLong(1, 0); 
                sc.setString(2, this.nomeBiblioteca);
                sc.executeUpdate();
                System.out.println("Biblioteca listada com sucesso!");
            }
        }catch (SQLException exception){
            System.out.println("Erro ao listar biblioteca: "+exception.getMessage());
        }
    }

    public static void listarBiblioteca(){
        try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova_java_sql", "root", "")){
            try (PreparedStatement sc = connManager.prepareStatement("SELECT id_biblioteca, nome_biblioteca, id_livro, id_midia_digital, idAutor, id_editora FROM prova_java_sql.cadastrarbiblioteca")){
                try(ResultSet ra = sc.executeQuery()){
                    if(ra.next()){
                        long id = ra.getLong(0);
                        String nome = ra.getString(1);
                        Integer id_livro = ra.getInt(2);
                        Integer id_midia_digital = ra.getInt(3);
                        Integer idAutor = ra.getInt(4);
                        Integer id_editora =ra.getInt(5);
                        System.out.println("ID: "+id+"\n Nome da biblioteca: "+nome+"\n ID do Livro: "+id_livro+"\nID da Mídia Digital: "+id_midia_digital+"\nID do Autor: "+idAutor+"\n ID da Editora: "+id_editora);
                    }
                }
            }
        }catch (SQLException exception){
            System.out.println("Erro ao listar biblioteca: "+exception.getMessage());
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
