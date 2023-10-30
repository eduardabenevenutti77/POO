import java.util.ArrayList;

public class CadastrarClassificacao {
    protected String classificacao;   

    static ArrayList<CadastrarClassificacao> classificacoes = new ArrayList<CadastrarClassificacao>();

    //método construtor da classe pai
    public CadastrarClassificacao(String classificacao) {
        this.classificacao = classificacao;
        classificacoes.add(this);
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
    //foreach para listar as classificações
    public static void listarClassificacoes(){
        for(CadastrarClassificacao listarClassificacao: classificacoes){
            System.out.println("Classificações Cadastrados = "+listarClassificacao);
        }
    }
}
