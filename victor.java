package demo;

import java.util.Scanner;

public class DemoTranslation {
	public static void main(String[] args) {
		int n1, n2, media = 0;

		System.out.print("Digite a Nota 1: ");
		n1 = STDIN_SCANNER.nextInt();

		System.out.print("Digite a Nota 2: ");
		n2 = STDIN_SCANNER.nextInt();

		media = (n1 + n2) / 2;

		if(media >= 6) {
			System.out.print("Aluno Aprovado");
		} else {
			System.out.print("Aluno Reprovado");
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.print("acabou!");
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
