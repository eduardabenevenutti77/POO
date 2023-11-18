package prova_conexao_sql_java;
import java.util.ArrayList;

public class CadastrarMidia extends CadastrarClassificacao {
    private String nomeMidia;
    private boolean disponibilidade;
    public static ArrayList<CadastrarMidia> midias = new ArrayList<CadastrarMidia>();

    //método construtor da classe filho
    public CadastrarMidia(String nomeMidia, boolean disponibilidade, String classificacao) {
        super(classificacao);
        this.nomeMidia = nomeMidia;
        this.disponibilidade = disponibilidade;
        midias.add(this);
    }
    //criação de set e get da classe filho
    public void setMidia(String nomeMidia) {
        this.nomeMidia = nomeMidia;
    }
    public String getMidia() {
        return this.nomeMidia;
    }
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    public boolean getDisponibilidade(){
        return this.disponibilidade;
    }
    //método para devolver e emprestar livro
    public void emprestarMidia() throws Exception {
        if (!this.disponibilidade) {
            throw new Exception("A mídia não está disponível para alocação");
        }
        this.disponibilidade = false;
    }
    public void devolverMidia() throws Exception {
        if (this.disponibilidade) {
            throw new Exception("O elemento está disponível para alocação");
        }
        this.disponibilidade = true;
    }
    //método toString() da classe filho
    public String toString() {
        return "\n\tListagem de Mídia\nNome da mídia = " + this.nomeMidia +
                "\nClassificação = " + super.getClassificacao() + 
                "& Disponibilidade = " + getDisponibilidade(); 
    }
}
