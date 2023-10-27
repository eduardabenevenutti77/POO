import java.util.ArrayList;

public class CadastrarBiblioteca {
    private String nomeBiblioteca;
    public  ArrayList<CadastroLivro> livros;
    public  ArrayList<CadastroLivro> editoras;

    public static ArrayList<CadastrarBiblioteca> bibliotecas = new ArrayList<CadastrarBiblioteca>();

    //método construtor da classe
    public CadastrarBiblioteca(String nomeBiblioteca){
        this.nomeBiblioteca = nomeBiblioteca;
        this.livros = new ArrayList<CadastroLivro>();
        bibliotecas.add(this);
    }
    //método toString()
    public String toString(){
        return "Nome Biblioteca = "+this.nomeBiblioteca;
    }
    //funções para emprestar e devolver livros
    public void adicionarLivro(CadastroLivro livros){
        this.livros.add(livros);
    }
    public void imprimirLivros(){
        for(CadastroLivro nomelivro: livros){
            System.out.println("\nTitulos dos livros cadastrados = "+nomelivro.toString());
        }
    }
    //foreach de bibliotecas
    public static void imprimirBibliotecas(){
        for(CadastrarBiblioteca biblioteca: bibliotecas){
            System.out.println("\nBiblioteca/s cadastrada/s = "+biblioteca.toString());
            biblioteca.imprimirLivros();
        }
    }
}
