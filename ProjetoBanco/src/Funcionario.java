
public class Funcionario {
	// atributos ou propriedades ou vari�veis de inst�ncia
		String cpf;
		String nome;
		double salario;
		static double valeRefeicao = 1230.00;

		// m�todo para retornar todos os dados
		public String retornarDados() {
			String aux = "";
			aux += "CPF -> " + nome + "\n";
			aux += "Nome -> " + nome + "\n";
			aux += "Sal�rio -> R$ " + salario + "\n";
			return aux;
		}

		// m�todo para aumentar o sal�rio de acordo com uma porcentagem
		public void aumentarSalario(double porcentagem) {
			salario *= (1 + porcentagem / 100);
		}
		
		public void ajustarValeRefeicao(double porcentagem) {
			valeRefeicao *= (1 + porcentagem / 100);
		}
}
