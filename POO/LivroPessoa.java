package POO;

public class LivroPessoa {
	private String name;
	private int idade;
	private String sexo;
	
	public void fazerAniversario(){
		this.idade++;
	}

	public LivroPessoa(String name, int idade, String sexo) {
		super();
		this.name = name;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
