 public class Banda {
    
    public String nome;
    public String tipo;
    int numerodeIntegrantes, posicao;


  public Banda(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String toString() {
    return nome + " (" + tipo + ")";
}
  }