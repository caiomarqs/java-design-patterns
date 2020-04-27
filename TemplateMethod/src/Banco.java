import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Banco {

	
	private String nomeBanco;
	private String endereco;
	private String telefone;
	private String email;
	private Date dataAtual;
	private List<Conta> contas;

	public Banco(String nomeBanco, String endereco, String telefone, String email, List<Conta> contas) {
		this.nomeBanco = nomeBanco;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.dataAtual = Calendar.getInstance().getTime();
		this.contas = contas;
	}
	
	public Banco(String nomeBanco, String endereco, String telefone, String email) {
		this.nomeBanco = nomeBanco;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.dataAtual = Calendar.getInstance().getTime();
		contas = new ArrayList<Conta>();
	}
	
	public void addConta(Conta conta) {
		contas.add(conta);
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public Date getDataAtual() {
		return dataAtual;
	}

	public List<Conta> getContas() {
		return contas;
	}
}
