package Quest3;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, maior;

		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextInt();

		if (num1 > num2) {
			maior = num1;
		} else {
			maior = num2;
		}

		System.out.println("O maior número é " + maior + ".");
	}
}