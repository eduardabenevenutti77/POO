import java.util.ArrayList;

public class CadastroAutor extends Pessoas{
    private String email;
    private String nacionalidade;
    public static ArrayList<CadastroAutor> nomeAutores = new ArrayList<CadastroAutor>();

    public CadastroAutor(String nome, String email, String nacionalidade){
        super(nome);
        this.email = email;
        this.nacionalidade = nacionalidade;
        nomeAutores.add(this);
    }

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

    public static ArrayList<CadastroAutor> getNomeAutores(){
        return nomeAutores;
    }

    public String toString(){
        return super.nome.toString()+",\n E-mail: "+this.email+" & nacionalidade: "+this.nacionalidade;
    }
    
    public static void listarAutores(){
        for(CadastroAutor listarEscritores: nomeAutores){
            System.out.println("Autores Cadastrados = "+listarEscritores.toString());
        }
    }
}