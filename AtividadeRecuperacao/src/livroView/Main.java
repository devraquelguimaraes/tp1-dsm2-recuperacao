package livroView;
import livroModel.Livro;

public class Main {
	    public static void main(String[] args) {

	        Livro livro = new Livro();

	        livro.titulo = "Java para Iniciantes";
	        livro.autor = "Herbert Schildt";
	        livro.anoPublicacao = 2024;

	        System.out.println("Título: " + livro.titulo);
	        System.out.println("Autor: " + livro.autor);
	        System.out.println("Ano de publicação: " + livro.anoPublicacao);

	    }
	}


