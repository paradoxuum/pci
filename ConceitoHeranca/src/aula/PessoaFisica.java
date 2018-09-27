package aula;

public class PessoaFisica extends Pessoa {
	private String rg;
	private String cpf;
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public static void main (String args[]) {
	
		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setNome("Huguinho");
		pessoa.setEndereco("Rua Lá");
		pessoa.setBairro("Vila de Cá");
		pessoa.setRg("12245758-9");
		pessoa.setCpf("456789123-44");
		
		System.out.println(pessoa.getNome() +"\n"+ pessoa.getEndereco() +"\n" + pessoa.getBairro() +"\n" + pessoa.getRg() +"\n" + pessoa.getCpf());
			
	}

}
