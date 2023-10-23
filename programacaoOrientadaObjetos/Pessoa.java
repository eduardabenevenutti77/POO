public class Pessoa { // objeto

    public String nome; // atribuição de valores
    public double peso;
    public double altura;
    public String dataNasc;

    // construtor - cria uma classe
    public Pessoa(String nome, double peso, double altura, String dataNasc) {
        this.nome = nome; // representa o nome dentro no objeto
        this.peso = peso;
        this.altura = altura;
        this.dataNasc = dataNasc;
    }

    // metodos
    public double calculoIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public String textoIMC() {
        double imc = this.calculoIMC();
        if (imc <= 18.5) {
            return "Abaixo do peso";
        } else if (imc <= 24.9) {
            return "Peso Ideal";
        } else if (imc <= 29.9) {
            return "Levemente acima do peso";
        } else if (imc <= 34.9) {
            return "Obesidade Grau I";
        } else if (imc <= 39.9) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III (mórbida)";
        }
    }
}
