import java.util.ArrayList;

public class CadastrarMidia extends CadastrarClassificacao {
    private String nomeMidia;

    public static ArrayList<CadastrarMidia> midias = new ArrayList<CadastrarMidia>();

    //método construtor da classe filho
    public CadastrarMidia(String nomeMidia, boolean disponibilidade, String classificacao) {
        super(classificacao, disponibilidade);
        this.nomeMidia = nomeMidia;
        midias.add(this);
    }
    //criação de set e get da classe filho
    public void setMidia(String nomeMidia) {
        this.nomeMidia = nomeMidia;
    }
    public String getMidia() {
        return this.nomeMidia;
    }
    //método toString() da classe filho
    public String toString() {
        return "\n\tListagem de Mídia\nNome da mídia = " + this.nomeMidia +
                "\nClassificação = " + super.getClassificacao() + 
                "& Disponibilidade = " + super.getDisponibilidade(); 
    }
}
