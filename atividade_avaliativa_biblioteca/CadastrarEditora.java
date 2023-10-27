import java.util.ArrayList;

public class CadastrarEditora extends Empresa {
    private String email_contato; 

    public static ArrayList<CadastrarEditora> editoras = new ArrayList<CadastrarEditora>();
    
    //método construtor da classe filho
    public CadastrarEditora(int cnpj,String nomeEditora,  String email_contato) {
        super(cnpj, nomeEditora);
        this.email_contato = email_contato;
        editoras.add(this);
    }
    //criação do método set e get
    public void setEmail_contato(String email_contrato){
        this.email_contato = email_contrato;
    }
    public String getEmail_contato(String email_contato){
        return this.email_contato;
    }
    //método toString da classe filho
    public String toString(){
        return super.nomeEditora.toString()+", cnpj: "+super.getCnpj()+"& e-mail: "+this.email_contato;
    }
    //foreach da classe filho
    public static void listarEditoras(){
        for(CadastrarEditora listarEditoras: editoras){
            System.out.println("Editoras Cadastradas: "+listarEditoras);
        }
    }
}