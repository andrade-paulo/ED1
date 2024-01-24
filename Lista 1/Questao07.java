import java.util.Scanner;

class Questao07 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um numero real: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Informe outro numero real: ");
		double n2 = sc.nextDouble();

		if (n2 == 0) {
			System.out.println("Invalido! Divisao por zero e indefinida");
		} else {
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
		}
	}
}
