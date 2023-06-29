package aula2;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos: ");
		int qtd_alunos = entrada.nextInt();
		int T_aluno = qtd_alunos;
		double nota = 0;
		double soma = 0;
		double media = 0;
		while(qtd_alunos>0) {
			System.out.print("Digite a nota: ");
			nota = entrada.nextDouble();
			soma = soma + nota;
			qtd_alunos --;
			
		}
		media = soma/T_aluno;
		System.out.print(media);
	}
}
