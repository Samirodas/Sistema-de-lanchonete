import java.util.Date;

public class DetalhesNotaFiscal {
  private Pedido pedido;

  public DetalhesNotaFiscal(Pedido pedido) {
    this.pedido = pedido;
  }

  public void gerarDetalhesNotaFiscal() {
    System.out.println("Detalhes da nota fiscal para o pedido de " + pedido.getNomeDoCliente());
    System.out.println("Itens do pedido:");
    for (Produto produto : pedido.getItensComprados()) {
      System.out.println("- " + produto.getDescricao() + " - Preço: " + produto.getPreco());
    }
    System.out.println("Taxa de entrega: " + pedido.getTaxaDeEntrega());
    System.out.println("Total: " + pedido.calcularTotal());
    
  }
}