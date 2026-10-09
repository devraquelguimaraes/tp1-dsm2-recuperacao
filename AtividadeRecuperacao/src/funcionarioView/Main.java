package funcionarioView;
import funcionarioModel.Funcionario;

public class Main {
	    public static void main(String[] args) {

	        Funcionario f1 = new Funcionario("Raquel Lima", 3000.0, "Analista");

	        f1.setNome("Raquel Lima");
	        f1.setCargo("Desenvolvedor");

	        System.out.println("Nome: " + f1.getNome());
	        System.out.println("Cargo: " + f1.getCargo());
	        System.out.println("Salário: R$ " + f1.getSalario());

	        f1.reajustarSalario(10);

	        System.out.println("Salário após reajuste: R$ " + f1.getSalario());

	    }
}

