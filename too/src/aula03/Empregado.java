package aula03;

public class Empregado extends Pessoa {
	
	private String endereco;
	private float salario;
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Empregado(String nome, int idade, String cpf, String endereco, float salario) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setCpf(cpf);
		this.setEndereco(endereco);
		this.setSalario(salario);
		System.out.println("Passei por aqui");
		System.out.println(this.getNome());
	}
}

