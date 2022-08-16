import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Nome do funcionário 1-> ");
		f1.nome = ler.next();
		System.out.print("CPF-> ");
		f1.cpf = ler.next();
		System.out.print("Salário-> ");
		f1.salario = ler.nextDouble();
		
		System.out.print("Nome do funcionário 2-> ");
		f2.nome = ler.next();
		System.out.print("CPF-> ");
		f2.cpf = ler.next();
		System.out.print("Salário-> ");
		f2.salario = ler.nextDouble();
		
		System.out.println("\n" + "Nome: " + f1.nome + "\n" + "Vale Refeição: " + f1.valeRefeicao);
		System.out.println("Nome: " + f2.nome + "\n" + "Vale Refeição: " + f2.valeRefeicao + "\n");
		
		f1.ajustarValeRefeicao(10);//10%
		
		System.out.println("Nome: " + f1.nome + "\n" + "Vale Refeição reajustado: " + f1.valeRefeicao);
		System.out.println("Nome: " + f2.nome + "\n" + "Vale Refeição reajustado: " + f2.valeRefeicao);
	}

}
