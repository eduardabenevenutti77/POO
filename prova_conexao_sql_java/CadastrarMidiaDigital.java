package prova_conexao_sql_java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastrarMidiaDigital extends CadastrarClassificacao{
  private String nomeAlbum;
  private String nomeCantor;
  private String data_lancamento;
  private boolean disponibilidade;
  
  //método construtor da classe filho
  public CadastrarMidiaDigital(String nomeAlbum, String nomeCantor, String data_lancamento, boolean disponibilidade, String classificacao){
    super(classificacao);
    this.nomeAlbum = nomeAlbum;
    this.data_lancamento = data_lancamento;
    this.nomeCantor = nomeCantor;
    this.disponibilidade = disponibilidade;

     try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova_java_sql", "root", "")) {
            try (PreparedStatement sc = connManager.prepareStatement("INSERT INTO prova_java_sql.cadastrarmidiadigital VALUES (?, ?, ?, ?, ?)")){ 
                sc.setLong(1, 0); 
                sc.setString(2, this.nomeAlbum);
                sc.setString(3, this.nomeCantor);
                sc.setString(4, this.data_lancamento);
                sc.setBoolean(5, this.disponibilidade);
                sc.executeUpdate();
                System.out.println("Mídia Digital cadastrada com sucesso!");
            }
        } catch (SQLException exception) {
            System.out.println("Erro ao cadastrar mídia digital: " + exception.getMessage());
        }

        try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova_java_sql", "root", "")) {
          try (PreparedStatement sc = connManager.prepareStatement("UPDATE prova_java_sql.cadastrarmidiadigital SET nomeAlbum = ?, nomeCantor = ?, data_lancamento = ?, disponibilidade = ? WHERE id_midia_digital = ?")){ 
              sc.setLong(1, 0); 
              sc.setString(2, this.nomeAlbum);
              sc.setString(3, this.nomeCantor);
              sc.setString(4, this.data_lancamento);
              sc.setBoolean(5, this.disponibilidade);
              sc.executeUpdate();
              System.out.println("Mídia Digital atualizado com sucesso!");
          }
      } catch (SQLException exception) {
           System.out.println("Erro ao atualizar mídia digital: " + exception.getMessage());
      }

      try (Connection connManager = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova_java_sql", "root", "")) {
        try (PreparedStatement sc = connManager.prepareStatement("DELETE FROM prova_java_sql.cadastrarmidiadigital WHERE id_midia_digital = ?")){ 
            sc.setLong(1, 0); 
            sc.setString(2, this.nomeAlbum);
            sc.setString(3, this.nomeCantor);
            sc.setString(4, this.data_lancamento);
            sc.setBoolean(5, this.disponibilidade);
            sc.executeUpdate();
            System.out.println("Mídia Digital excluida com sucesso!");
        }
    } catch (SQLException exception) {
         System.out.println("Erro ao excluir mídia digital: " + exception.getMessage());
    }
  }
  //agrupamento de set's e get's
  public void setAlbum(String nomeAlbum){
    this.nomeAlbum = nomeAlbum;
  }
  public String getAlbum(){
    return this.nomeAlbum;
  }
  public void setCantor(String nomeCantor){
    this.nomeCantor = nomeCantor;
  }
  public String getCantor(){
    return  this.nomeCantor;
  }
  public void setData(String data_lancamento){
    this.data_lancamento = data_lancamento;
  }
  public String getData(){
    return this.data_lancamento;
  }
  public void setDisponibilidade(boolean disponibilidade){
    this.disponibilidade = disponibilidade;
  }
  public boolean getDisponibilidade(){
    return this.disponibilidade;
  }
  //método para emprestar e devolver mídia digital
  public void emprestarDigital() throws Exception {
        if (!this.disponibilidade) {
            throw new Exception("A mídia digital não está disponível para alocação");
        }
        this.disponibilidade = false;
    }
    public void devolverDigital() throws Exception {
        if (this.disponibilidade) {
            throw new Exception("A mídia digital está disponível para alocação");
        }
        this.disponibilidade = true;
    }
  //método toString() da classe filho
  public  String toString(){
    return "\n\tListagem de Mídias Digitais\nNome do Álbum: "+this.nomeAlbum+
    "\n Nome do Cantor: "+this.nomeCantor+
    "\n Data de Lançamento: "+this.data_lancamento+
    "\n Classificação: "+super.getClassificacao()+
    "& Disponibilidade: "+this.disponibilidade;
  }
}
