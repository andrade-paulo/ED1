import java.util.Scanner;

class Questao11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		Conta paulo = new Conta("Paulo", 982.26f);	
		Conta henrique = new Conta("Henrique", 321.80f);

		System.out.println(paulo);
		System.out.println(henrique);

		System.out.println();
		
		System.out.print("Escolha o valor da transferencia: ");
		float transf = sc.nextFloat();

		paulo.transferir(transf, henrique);

		System.out.println();
		System.out.println(paulo);
		System.out.println(henrique);
	}
}

class Conta {
	public String titular;
	private float saldo;

	public Conta(String titular, float saldo) {
		this.titular = titular;
		this.setSaldo(saldo);
	}	

	public float getSaldo() {
		return saldo;	
	}

	public void setSaldo(float novoSaldo) {
		if (novoSaldo >= 0)
			this.saldo = novoSaldo;
		else
			throw new IllegalArgumentException();
	}

	public void transferir(float quantidade, Conta destino) {
		if (this.getSaldo() >= quantidade) {
			destino.setSaldo(destino.getSaldo() + quantidade);
			this.setSaldo(this.getSaldo() - quantidade);

			System.out.println("Transferencia bem-sucedida.");
		} else {
			System.out.println("Erro: saldo insuficiente!");
		}
	}

	@Override
	public String toString() {
		return "Titular: " + this.titular + " | Saldo: " + saldo;
	}
}
