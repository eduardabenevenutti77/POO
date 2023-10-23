public class Cesar {
  public String mensagem;
  public int valorConstante;

  public Cesar(String mensagem, int valorConstante) {
    this.mensagem = mensagem;
    this.valorConstante = valorConstante;
  }

  public String criptografar() {
    char[] alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    StringBuilder mensagemCifrada = new StringBuilder();

    for (char letra : mensagem.toCharArray()) {
      if (Character.isLetter(letra)) {
        char maiuscula = Character.toUpperCase(letra);
        int indice = maiuscula - 'A';
        int novoIndice = (indice + valorConstante) % 26;
        char novaLetra = alfabeto[novoIndice];
        mensagemCifrada.append(Character.isLowerCase(letra) ? Character.toLowerCase(novaLetra) : novaLetra);
      } else {
        mensagemCifrada.append(letra);
      }
    }
    return mensagemCifrada.toString();
  }
}
