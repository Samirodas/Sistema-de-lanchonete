import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedidoCliente = new Pedido("João", 2.50);
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Pizza");
            System.out.println("2 - Adicionar Lanche");
            System.out.println("3 - Adicionar Salgadinho");
            System.out.println("4 - Finalizar Pedido");
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    adicionarPizza(pedidoCliente);
                    break;
                case 2:
                    adicionarLanche(pedidoCliente);
                    break;
                case 3:
                    adicionarSalgadinho(pedidoCliente);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        
        DetalhesNotaFiscal detalhesNotaFiscal = new DetalhesNotaFiscal(pedidoCliente);
        detalhesNotaFiscal.gerarDetalhesNotaFiscal();

        System.out.println("Total do pedido: R$" + pedidoCliente.calcularTotal());
        
        scanner.close();
    }
    
    private static void adicionarPizza(Pedido pedido) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço da pizza:");
        double preco = scanner.nextDouble();
        System.out.println("Digite o tipo da pizza:");
        String tipo = scanner.next();
        System.out.println("Digite o tipo da borda:");
        String borda = scanner.next();
        System.out.println("Digite o tipo do molho:");
        String molho = scanner.next();
        Pizza pizza = new Pizza(preco, new Date(), 500, tipo, borda, molho);
        pedido.adicionarItem(pizza);
    }
    
    private static void adicionarLanche(Pedido pedido) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço do lanche:");
        double preco = scanner.nextDouble();
        System.out.println("Digite o tipo do pão:");
        String pao = scanner.next();
        System.out.println("Digite o tipo do recheio:");
        String recheio = scanner.next();
        System.out.println("Digite o tipo do molho:");
        String molho = scanner.next();
        Lanche lanche = new Lanche(preco, new Date(), 200, pao, recheio, molho);
        pedido.adicionarItem(lanche);
    }
    
    private static void adicionarSalgadinho(Pedido pedido) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço do salgadinho:");
        double preco = scanner.nextDouble();
        System.out.println("Digite o tipo do salgadinho:");
        String tipo = scanner.next();
        System.out.println("Digite o tipo da massa:");
        String massa = scanner.next();
        System.out.println("Digite o tipo do recheio:");
        String recheio = scanner.next();
        Salgadinho salgadinho = new Salgadinho(preco, new Date(), 50, tipo, massa, recheio);
        pedido.adicionarItem(salgadinho);
    }
}