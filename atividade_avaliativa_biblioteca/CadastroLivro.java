import java.util.ArrayList;

public class CadastroLivro extends CadastrarClassificacao {
    private String tituloLivro;
    private CadastroAutor nome;
    private int numeroINNS;
    private boolean disponibilidade;

    public static ArrayList<CadastroLivro> livros = new ArrayList<CadastroLivro>();

    //método construtor da classe
    public CadastroLivro(String tituloLivro, CadastroAutor nome, boolean disponibilidade, int numeroINNS, String classificacao) {
        super(classificacao); 
        this.tituloLivro = tituloLivro;
        this.nome = nome;
        this.numeroINNS = numeroINNS;
        this.disponibilidade = disponibilidade;
        
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
    public int getNumeroINNS() {
        return this.numeroINNS;
    }
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    public boolean getDisponibilidade(){
        return this.disponibilidade;
    }
    //método de emprestar e devolver livro
    public void emprestarLivros() throws Exception {
        if (!this.disponibilidade) {
            throw new Exception("O livro não está disponível para alocação");
        }
        this.disponibilidade = false;
    }
    public void devolverLivro() throws Exception {
        if (this.disponibilidade) {
            throw new Exception("O livro está disponível para alocação");
        }
        this.disponibilidade = true;
    }
    //método toString da classe
    public String toString() {
        return "\n\tListagem de Livros\nNome do Livro = " + this.tituloLivro +
               "\nNome do Autor = " + this.nome + // Use um atributo específico do autor
               "\nDisponível: " + this.disponibilidade +
               "\n Número do INNS = " + this.numeroINNS +
               "& Classificação = " + super.classificacao;
    }
    //foreach de listagem
    public static void listarLivros() {
        for (CadastroLivro listarLivros : livros) {
            System.out.println("\nLivros cadastrados = " + listarLivros.toString() + ";");
        }
    }
}
