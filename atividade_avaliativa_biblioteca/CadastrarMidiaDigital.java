import java.util.ArrayList;

public class CadastrarMidiaDigital extends CadastrarClassificacao{
  private String nomeAlbum;
  private String nomeCantor;
  private String data_lancamento;
  public static ArrayList<CadastrarMidiaDigital> digitais = new ArrayList<CadastrarMidiaDigital>();
  
  public CadastrarMidiaDigital(String nomeAlbum, String nomeCantor, String data_lancamento, boolean disponibilidade, String classificacao){
    super(classificacao, disponibilidade);
    this.nomeAlbum = nomeAlbum;
    this.data_lancamento = data_lancamento;
    this.nomeCantor = nomeCantor;

    digitais.add(this);
  }

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

  public static ArrayList<CadastrarMidiaDigital> geDigitais(){
    return digitais;
  }

  public  String toString(){
    return "\n\tListagem de Mídias Digitais\nNome do Álbum: "+this.nomeAlbum+
    "\n Nome do Cantor: "+this.nomeCantor+
    "\n Data de Lançamento: "+this.data_lancamento+
    "\n Classificação: "+super.getClassificacao()+
    "& Disponibilidade: "+super.getDisponibilidade();
  }
}
