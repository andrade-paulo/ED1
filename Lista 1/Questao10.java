import java.util.Scanner;

class Questao10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um numero inteiro: ");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("O numero " + n + " e par");
		} else {
			System.out.println("O numero " + n + " e impar");
		}
	}
}
