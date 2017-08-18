
public class Disciplina {
				//ATRIBUTOS
	
	private String nome;
	private String curso;
	private int cargaHoraria;
	
//-----------------------------------------------------------------------------------------------------------------------
	
				//M�TODOS
	
		//M�TODO GET E SET
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	
	
//-----------------------------------------------------------------------------------------------------------------------	
	
	
			//M�TODO CONSTRUTOR
	
	 public Disciplina(String nome, String curso, int cargaHoraria) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.cargaHoraria = cargaHoraria;
	}
	
//-----------------------------------------------------------------------------------------------------------------------	
			
	
			//M�TODO toString
	
	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", curso=" + curso + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
	
	
//-----------------------------------------------------------------------------------------------------------------------
	
			//M�TODO CRIADO EM SALA PELO PROFESSOR
			
			public String imprimirDisciplina() {
				return "Dados do Aluno \n"  +
						"Nome: " + getNome() + "\n" + 
						"Curso: " + getCurso() + "\n" +
						"Carga Horaria: " + getCargaHoraria();
				
			
			
			}
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
