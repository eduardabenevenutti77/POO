import java.util.ArrayList;

public class CadastrarClassificacao {
    protected String classificacao;   
    protected boolean disponibilidade;

    static ArrayList<CadastrarClassificacao> classificacoes = new ArrayList<CadastrarClassificacao>();

    //método construtor da classe pai
    public CadastrarClassificacao(String classificacao, boolean disponibilidade) {
        this.classificacao = classificacao;
        this.disponibilidade = disponibilidade;
        classificacoes.add(this);
    }
    //agrupamento de set's e get's
    public void setClassificacao(String classificacao){
        this.classificacao = classificacao;
    }
    public String getClassificacao(){
        return this.classificacao;
    }
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    public Boolean getDisponibilidade() {
        return this.disponibilidade;
    }
    //função para emprestar e devolver
    public void emprestarLivros() throws Exception {
        if (!this.disponibilidade) {
            throw new Exception("O elemento não está disponível para alocação");
        }
        this.disponibilidade = false;
    }
    public void devolverLivro() throws Exception {
        if (this.disponibilidade) {
            throw new Exception("O elemento está disponível para alocação");
        }
        this.disponibilidade = true;
    }
    //método toString()
    public String toString() {
        return "\n\tListagem de Classificação e Disponibilidade\nClassificação: " + this.classificacao+
        "& Disponibilidade: "+this.disponibilidade;
    }    
    //foreach para listar as classificações
    public static void listarClassificacoes(){
        for(CadastrarClassificacao listarClassificacao: classificacoes){
            System.out.println("Classificações Cadastrados = "+listarClassificacao);
        }
    }
}
