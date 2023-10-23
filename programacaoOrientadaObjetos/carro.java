public class carro {
    /*abstração*/
    String placa;
    String cor;
    String modelo;
    int ano;
    int velocimetro;

    /*idealização da classe*/
    public carro(String placa){
        this.placa = placa;
    }
    
    public void acelerar(){
        this.velocimetro++;
    }


}
