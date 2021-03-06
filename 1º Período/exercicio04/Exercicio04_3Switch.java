package exercicio04;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04_3Switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$#,###.00");

		int codigo, quantidade, contador = 0;
		float valorConta = 0, somatoria = 0;

		System.out.println("=================================");
		System.out.println("            CARD�PIO            ");
		System.out.println("");
		System.out.println("Produto          Cod    Pre�o");
		System.out.println("Cachorro Quente  100    R$1,20");
		System.out.println("Bauru Simples    101    R$1,30");
		System.out.println("Bauru com ovo    102    R$1,50");
		System.out.println("Hamb�rguer       103    R$1,20");
		System.out.println("Cheeseburguer    104    R$1,30");
		System.out.println("Refrigerante     105    R$1,00");
		System.out.println("=================================");

		do {

			do {
				System.out.println("");
				System.out.print("Escreva o c�digo do produto: ");
				codigo = leia.nextInt();
				if (codigo < 100 || codigo > 105) {
					System.out.println("C�digo Inv�lido!");
				}
			} while (codigo < 100 || codigo > 105);

			System.out.print("Escreva a quantidade do produto: ");
			quantidade = leia.nextInt();
			System.out.println("");
			System.out.println("Produto Selecionado: ");

			switch (codigo) {
			case 100:
				System.out.println("Cachorro Quente (R$1,20) x" + (quantidade));
				valorConta = quantidade * 1.2f;
				break;
			case 101:
				System.out.println("Bauru Simples (R$1,30) x" + (quantidade));
				valorConta = quantidade * 1.3f;
				break;
			case 102:
				System.out.println("Bauru com Ovo (R$1,50) x" + (quantidade));
				valorConta = quantidade * 1.5f;
				break;
			case 103:
				System.out.println("Hamb�rguer (R$1,20) x" + (quantidade));
				valorConta = quantidade * 1.2f;
				break;
			case 104:
				System.out.println("Cheeseburguer (R$1,30) x" + (quantidade));
				valorConta = quantidade * 1.3f;
				break;
			case 105:
				System.out.println("Refrigerante (R$1,00) x" + (quantidade));
				valorConta = quantidade * 1f;
				break;
			}

			somatoria += valorConta;
			contador++;
		} while (contador < 5);

		/*
		 * if (codigo == 100) {
		 * System.out.println("Cachorro Quente (R$1,20) x"+(quantidade)); valorConta =
		 * quantidade * 1.2f; } else if (codigo == 101) {
		 * System.out.println("Bauru Simples (R$1,30) x"+(quantidade)); valorConta =
		 * quantidade * 1.3f; } else if (codigo == 102) {
		 * System.out.println("Bauru com Ovo (R$1,50) x"+(quantidade)); valorConta =
		 * quantidade * 1.5f; } else if (codigo == 103) {
		 * System.out.println("Hamb�rguer (R$1,20) x"+(quantidade)); valorConta =
		 * quantidade * 1.2f; } else if (codigo == 104) {
		 * System.out.println("Cheeseburguer (R$1,30) x"+(quantidade)); valorConta =
		 * quantidade * 1.3f; } else if (codigo == 105) {
		 * System.out.println("Refrigerante (R$1,00) x"+(quantidade)); valorConta =
		 * quantidade * 1f; } else { System.out.println("C�digo Inv�lido!"); }
		 */

		System.out.println("=================================");
		System.out.println("Total a Pagar: " + df.format(somatoria));

		leia.close();
	}

}
