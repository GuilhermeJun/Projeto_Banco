import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Nome do funcion�rio 1-> ");
		f1.nome = ler.next();
		System.out.print("CPF-> ");
		f1.cpf = ler.next();
		System.out.print("Sal�rio-> ");
		f1.salario = ler.nextDouble();
		
		System.out.print("Nome do funcion�rio 2-> ");
		f2.nome = ler.next();
		System.out.print("CPF-> ");
		f2.cpf = ler.next();
		System.out.print("Sal�rio-> ");
		f2.salario = ler.nextDouble();
		
		System.out.println("\n" + "Nome: " + f1.nome + "\n" + "Vale Refei��o: " + f1.valeRefeicao);
		System.out.println("Nome: " + f2.nome + "\n" + "Vale Refei��o: " + f2.valeRefeicao + "\n");
		
		f1.ajustarValeRefeicao(10);//10%
		
		System.out.println("Nome: " + f1.nome + "\n" + "Vale Refei��o reajustado: " + f1.valeRefeicao);
		System.out.println("Nome: " + f2.nome + "\n" + "Vale Refei��o reajustado: " + f2.valeRefeicao);
	}

}
