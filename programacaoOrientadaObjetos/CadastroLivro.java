import java.util.ArrayList;

public class CadastroLivro extends CadastrarClassificacao {
    private String tituloLivro;
    private Pessoas nomeAutor;
    private int numeroINNS;
    public static ArrayList<CadastroLivro> livros = new ArrayList<CadastroLivro>();

    public CadastroLivro(String tituloLivro, Pessoas nomeAutor, boolean disponibilidade, int numeroINNS, String classificacao) {
        super(classificacao, disponibilidade); 
        this.tituloLivro = tituloLivro;
        this.nomeAutor = nomeAutor;
        this.numeroINNS = numeroINNS;
        livros.add(this);
    }

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

    public static ArrayList<CadastroLivro> getLivros() {
        return livros;
    }

    public String toString() {
        return "Nome do Livro = " + this.tituloLivro +
               ", Nome do Autor = " + this.nomeAutor.getNome() + // Use um atributo específico do autor
               ", Disponível: " + (this.disponibilidade ? "Sim" : "Não") +
               ", Número do INNS = " + this.numeroINNS +
               "& Classificação = " + super.classificacao;
    }
    
    public static void listarLivros() {
        for (CadastroLivro listarLivros : livros) {
            System.out.println("\nLivros cadastrados = " + listarLivros.toString() + ";");
        }
    }
}
