package mvc.model;

public class Paciente implements Comparable<Paciente> {
	
	private String nome;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}	
	
	@Override
	public int compareTo(Paciente pessoa) {
        return this.nome.compareTo(pessoa.getNome());  
    }
}