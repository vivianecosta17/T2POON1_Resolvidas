package Quest6;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("Digite um número inteiro: ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("O número " + num + " é par.");
		} else {
			System.out.println("O número " + num + " é ímpar.");
		}
	}
}