public class Empresa {
    protected int cnpj;
    protected String nomeEditora;

    public Empresa(int cnpj, String nomeEditora){
        this.cnpj = cnpj;
        this.nomeEditora = nomeEditora;
    }

    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
    public int getCnpj(){
        return this.cnpj;
    }

    public void setNomeEditora(String nomeEditora){
        this.nomeEditora = nomeEditora;
    }
    public String getNomeEditora(){
        return this.nomeEditora;
    }

    public String toString(){
        return "Editora: "+this.nomeEditora+", Cnpj: "+this.cnpj;
    }
}
