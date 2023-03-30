import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int salario,abonoSalarial, novoSalario;
		
		System.out.println("Digite o salário:");
		salario = leia.nextInt();
		System.out.println("Digite o abono: ");
		abonoSalarial = leia.nextInt();
		
		System.out.println("O seu novo salário é: " + (salario+abonoSalarial));
		
		
		

	}

}
