package mercadoModel;

public class Mercado {

	    private String[] nomesProdutos = new String[10];
	    private double[] precos = new double[10];
	    private double[] descontos = new double[10];
	    private int quantidade = 3;

	    public Mercado() {
	        nomesProdutos[0] = "Arroz";
	        precos[0] = 25.0;
	        descontos[0] = 10.0;

	        nomesProdutos[1] = "Feijão";
	        precos[1] = 10.0;
	        descontos[1] = 5.0;

	        nomesProdutos[2] = "Leite";
	        precos[2] = 6.0;
	        descontos[2] = 15.0;
	    }

	    public void listarProdutos() {
	        for (int i = 0; i < quantidade; i++) {
	            double precoFinal = precos[i] - (precos[i] * descontos[i] / 100);

	            System.out.println("Produto: " + nomesProdutos[i]);
	            System.out.println("Preço original: R$ " + precos[i]);
	            System.out.println("Preço com desconto: R$ " + precoFinal);
	            System.out.println();
	        }
	    }


	    public double calcularTotal() {
	        double total = 0;

	        for (int i = 0; i < quantidade; i++) {
	            total += precos[i] - (precos[i] * descontos[i] / 100);
	        }

	        return total;
	    }

	    public void maiorEconomia() {
	        if (quantidade == 0) {
	            System.out.println("Não há produtos cadastrados!");
	            return;
	        }

	        int maior = 0;

	        for (int i = 1; i < quantidade; i++) {
	            if (precos[i] * descontos[i] / 100 >
	                precos[maior] * descontos[maior] / 100) {
	                maior = i;
	            }
	        }

	        System.out.println("Produto com maior economia: " + nomesProdutos[maior]);
	        System.out.println("Economia: R$ " + (precos[maior] * descontos[maior] / 100));
	    }


	    public void comprarProduto(String nome) {
	        for (int i = 0; i < quantidade; i++) {
	            if (nomesProdutos[i].equalsIgnoreCase(nome)) {

	                for (int j = i; j < quantidade - 1; j++) {
	                    nomesProdutos[j] = nomesProdutos[j + 1];
	                    precos[j] = precos[j + 1];
	                    descontos[j] = descontos[j + 1];
	                }

	                quantidade--;
	                nomesProdutos[quantidade] = null;
	                precos[quantidade] = 0;
	                descontos[quantidade] = 0;

	                System.out.println("Produto comprado: " + nome);
	                return;
	            }
	        }

	        System.out.println("Produto não encontrado!");
	    }

	    public void reporProduto(String nome, double preco, double desconto) {
	        if (quantidade < nomesProdutos.length) {
	            nomesProdutos[quantidade] = nome;
	            precos[quantidade] = preco;
	            descontos[quantidade] = desconto;
	            quantidade++;

	            System.out.println("Produto reposto: " + nome);
	        } else {
	            System.out.println("Não há espaço para repor o produto!");
	        }
	    }
}


