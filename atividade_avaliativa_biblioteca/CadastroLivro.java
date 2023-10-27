import java.util.ArrayList;

public class CadastroLivro extends CadastrarClassificacao {
    private String tituloLivro;
    private Pessoas nome;
    private int numeroINNS;

    public static ArrayList<CadastroLivro> livros = new ArrayList<CadastroLivro>();

    //método construtor da classe
    public CadastroLivro(String tituloLivro, Pessoas nome, boolean disponibilidade, int numeroINNS, String classificacao) {
        super(classificacao, disponibilidade); 
        this.tituloLivro = tituloLivro;
        this.nome = nome;
        this.numeroINNS = numeroINNS;
        livros.add(this);
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
    public Integer getNumeroINNS() {
        return this.numeroINNS;
    }
    //
    public String toString() {
        return "\n\tListagem de Livros\nNome do Livro = " + this.tituloLivro +
               "\nNome do Autor = " + this.nome + // Use um atributo específico do autor
               "\nDisponível: " + (this.disponibilidade ? "Sim" : "Não") +
               "\n Número do INNS = " + this.numeroINNS +
               "& Classificação = " + super.classificacao;
    }
    public static void listarLivros() {
        for (CadastroLivro listarLivros : livros) {
            System.out.println("\nLivros cadastrados = " + listarLivros.toString() + ";");
        }
    }
}
