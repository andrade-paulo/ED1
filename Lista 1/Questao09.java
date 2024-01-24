import java.util.Scanner;
import java.lang.Math;

class Questao09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Raio: ");
		double raio = sc.nextDouble();

		System.out.println("A area e: " + (Math.PI * Math.pow(raio, 2)));
	}
}
