import java.util.ArrayList;

public class CadastroAutor extends Pessoas{
    private String email;
    private String nacionalidade;

    public static ArrayList<CadastroAutor> nomeAutores = new ArrayList<CadastroAutor>();

    //método construtor da classe filho
    public CadastroAutor(String nome, String email, String nacionalidade){
        super(nome);
        this.email = email;
        this.nacionalidade = nacionalidade;
        nomeAutores.add(this);
    }
    //agrupamento de set's e get's 
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    //método toString()
    public String toString(){
        return "\n\tListagem de Autores"+super.nome.toString()+"\n E-mail: "+this.email+"\n Nacionalidade: "+this.nacionalidade;
    }
    //foreach da classe filho
    public static void listarAutores(){
        for(CadastroAutor listarEscritores: nomeAutores){
            System.out.println("Autores Cadastrados = "+listarEscritores.toString());
        }
    }
}