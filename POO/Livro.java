package POO;

public class Livro implements LivroPublicacao {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private LivroPessoa leitor;
	
	public String detalhes() {
		return "Livro: titulo: " + titulo + ", autor: " + autor + ", totPaginas: "
				+ totPaginas + ", pagAtual: " + pagAtual + ", aberto: " + aberto
				+ "\nleitor: " + leitor.getName() + ", idade: " + leitor.getIdade() 
				+ ", sexo: " + leitor.getSexo() + ".";
	}

	public Livro(String titulo, String autor, int totPaginas, LivroPessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public LivroPessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(LivroPessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int p) {
		if (p > this.totPaginas){
			this.pagAtual = 0;
		}else {
			this.pagAtual = p;
		}
	}

	@Override
	public void avancarPag() {
		this.pagAtual++;
	}

	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
	
}
