import java.util.Scanner;
import java.lang.Math;

class Questao07 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o peso (kg): ");
		double n1 = sc.nextDouble();
		
		System.out.print("Informe a altura (m): ");
		double n2 = sc.nextDouble();

		if (n2 == 0) {
			System.out.println("Invalido! Divisao por zero e indefinida");
		} else {
			System.out.println("IMC = " + (n1 / Math.pow(n2, 2)));
		}
	}
}
