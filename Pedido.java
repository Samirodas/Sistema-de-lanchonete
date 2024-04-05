import java.util.ArrayList;
import java.util.List;

public class Pedido {
  private String nomeDoCliente;
  private List<Produto> itensComprados;
  private double taxaDeEntrega;

  public void adicionarItem(Produto produto) {
    this.itensComprados.add(produto);
  }

  public double calcularTotal() {
    double total = 0;
    for (Produto produto : itensComprados) {
      total += produto.getPreco();
    }
    total += taxaDeEntrega;
    return total;
  }

  public String getNomeDoCliente() {
    return nomeDoCliente;
  }

  public void setNomeDoCliente(String nomeDoCliente) {
    this.nomeDoCliente = nomeDoCliente;
  }

  public double getTaxaDeEntrega() {
    return taxaDeEntrega;
  }

  public void setTaxaDeEntrega(double taxaDeEntrega) {
    this.taxaDeEntrega = taxaDeEntrega;
  }

  public List<Produto> getItensComprados() {
    return itensComprados;
  }

  public Pedido(String nomeDoCliente, double taxaDeEntrega) {
    this.nomeDoCliente = nomeDoCliente;
    this.taxaDeEntrega = taxaDeEntrega;
    this.itensComprados = new ArrayList<>();
  }
  
}