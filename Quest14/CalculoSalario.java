package Quest14;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, novoSalario, bonificacao = 0, auxilioEscola = 0;

		System.out.print("Digite o salário do funcionário: ");
		salario = sc.nextDouble();

		if (salario <= 500) {
			bonificacao = salario * 0.05;
		} else if (salario > 500 && salario <= 1200) {
			bonificacao = salario * 0.12;
		}

		if (salario <= 600) {
			auxilioEscola = 150;
		} else if (salario > 600) {
			auxilioEscola = 100;
		}

		novoSalario = salario + bonificacao + auxilioEscola;

		System.out.println("O novo salário do funcionário é: R$ " + novoSalario);
	}
}