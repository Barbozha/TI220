package Exercicios;

public class Aluno {
	int RA;
	String nome;
	String endereco;
	String telefone;
	String periodo;
	
	public void estudar() {
		System.out.println("O aluno " + this.nome + " está estudando.");
	}
	
	public void dormir() {
		System.out.println("O aluno " + this.nome + " está dormindo.");
	}
	
	public void fazerProva() {
		System.out.println("O aluno " + this.nome +" está fazendo prova.");
	}
}
