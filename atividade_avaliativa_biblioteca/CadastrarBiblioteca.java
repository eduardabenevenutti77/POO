import java.util.ArrayList;

public class CadastrarBiblioteca {
    private String nomeBiblioteca;
    public  ArrayList<CadastroLivro> livros;
    public  ArrayList<CadastrarEditora> editoras;
    public ArrayList<CadastrarMidia> midias;

    public static ArrayList<CadastrarBiblioteca> bibliotecas = new ArrayList<CadastrarBiblioteca>();

    //método construtor da classe
    public CadastrarBiblioteca(String nomeBiblioteca){
        this.nomeBiblioteca = nomeBiblioteca;
        this.livros = new ArrayList<CadastroLivro>();
        this.midias = new ArrayList<CadastrarMidia>();
        this.editoras = new ArrayList<CadastrarEditora>();
        bibliotecas.add(this);
    }
    //agrupamento de set's e get's
    public void setNomeBiblioteca(String nomeBiblioteca){
        this.nomeBiblioteca = nomeBiblioteca;
    }
    public String getNomeBiblioteca(){
        return this.nomeBiblioteca;
    }
    public String getMidia(){
        return this.getMidia();
    }
    public String getTitulo(){
        return this.getTitulo();
    }
    public String getEmail(){
        return this.getEmail();
    }
    //método toString()
    public String toString(){
        return "\n\tListagem de Bibliotecas: \nNome da Biblioteca: "+
        this.getNomeBiblioteca()+"\nNome do Livro: "+this.getTitulo()+
        "\nNome da Editora"+this.getEmail()+"\nNome Mídia: "+this.getMidia();
    }
}
