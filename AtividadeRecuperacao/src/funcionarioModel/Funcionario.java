package funcionarioModel;

public class Funcionario {
	    private String nome;
	    private double salario;
	    private String cargo;

	    public Funcionario(String nome, double salario, String cargo) {
	        this.nome = nome;
	        this.salario = salario;
	        this.cargo = cargo;
	    }

	    public String getNome() {
	        return this.nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public double getSalario() {
	        return this.salario;
	    }

	    public String getCargo() {
	        return this.cargo;
	    }

	    public void setCargo(String cargo) {
	        this.cargo = cargo;
	    }

	    public void reajustarSalario(double percentual) {
	        if (percentual > 0) {
	            this.salario = this.salario + (this.salario * percentual / 100);
	        } else {
	            System.out.println("Reajuste inválido!");
	        }
	    }

}
