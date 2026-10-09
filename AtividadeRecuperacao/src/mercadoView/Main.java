package mercadoView;
import mercadoModel.Mercado;

public class Main {
	public static void main(String[] args) {

		Mercado mercado = new Mercado();

		System.out.println("--- Lista de produtos ---");
		mercado.listarProdutos();

		System.out.println("Total da compra: R$ " + mercado.calcularTotal());
		System.out.println();

		mercado.maiorEconomia();
		System.out.println();

		mercado.comprarProduto("Feijão");
		System.out.println();

		mercado.listarProdutos();
		mercado.reporProduto("Feijão", 10.0, 5.0);

		System.out.println();
		mercado.listarProdutos();
		
	}
}


