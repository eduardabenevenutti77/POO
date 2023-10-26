import java.util.ArrayList;

public class CadastrarEditora extends Empresa {
    private String email_contato; 
    public static ArrayList<CadastrarEditora> editoras = new ArrayList<CadastrarEditora>();
 
    public CadastrarEditora(int cnpj,String nomeEditora,  String email_contato) {
        super(cnpj, nomeEditora);
        this.email_contato = email_contato;
        editoras.add(this);
    }
    public void setEmail_contato(String email_contrato){
        this.email_contato = email_contrato;
    }
    public String getEmail_contato(String email_contato){
        return this.email_contato;
    }
    public static ArrayList<CadastrarEditora> getEditoras(){
        return editoras;
    }
    public String toString(){
        return super.nomeEditora.toString()+", cnpj: "+super.getCnpj()+"& e-mail: "+this.email_contato;
    }
    public static void listarEditoras(){
        for(CadastrarEditora listarEditoras: editoras){
            System.out.println("Editoras Cadastradas: "+listarEditoras);
        }
    }
}