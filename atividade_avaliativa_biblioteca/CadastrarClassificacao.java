import java.util.ArrayList;

public class CadastrarClassificacao {
    protected String classificacao;   
    protected boolean disponibilidade;
    static ArrayList<CadastrarClassificacao> classificacoes = new ArrayList<CadastrarClassificacao>();

    public CadastrarClassificacao(String classificacao, boolean disponibilidade) {
        this.classificacao = classificacao;
        this.disponibilidade = disponibilidade;
        classificacoes.add(this);
    }
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
    public String toString() {
        return "\n\tListagem de Classificação e Disponibilidade\nClassificação: " + this.classificacao+
        "& Disponibilidade: "+this.disponibilidade;
    }    
    public static void listarClassificacoes(){
        for(CadastrarClassificacao listarClassificacao: classificacoes){
            System.out.println("Classificações Cadastrados = "+listarClassificacao);
        }
    }
}
