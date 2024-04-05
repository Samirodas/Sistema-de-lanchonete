import java.util.Date;

public class Produto {
  private double preco;
  private Date dataValidade;
  private double peso;
  private String descricao;

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public Date getDataValidade() {
    return dataValidade;
  }

  public void setDataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  // Método para obter a descrição do produto
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Produto(double preco, Date dataValidade, double peso, String descricao) {
    this.preco = preco;
    this.dataValidade = dataValidade;
    this.peso = peso;
    this.descricao = descricao;
  }
}