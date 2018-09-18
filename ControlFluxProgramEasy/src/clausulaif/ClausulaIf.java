package clausulaif;

public class ClausulaIf {
	public static void main (String[] args) {
		int idade = 17;
		if (idade <= 12) {
			System.out.println("Criança");
		}
		else if (idade <= 19) {
			System.out.println("Adolecente");
		}
		else if (idade <= 60) {
			System.out.println("Adulto");
		}
		else {
		System.out.println("Idoso");
		}
	}
}
