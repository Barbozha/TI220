package Exercicios;

public class Aluno {
	int RA;
	String nome;
	String endereco;
	String telefone;
	String periodo;
	
	public void estudar() {
		System.out.println("O aluno " + this.nome + " est� estudando.");
	}
	
	public void dormir() {
		System.out.println("O aluno " + this.nome + " est� dormindo.");
	}
	
	public void fazerProva() {
		System.out.println("O aluno " + this.nome +" est� fazendo prova.");
	}
}
