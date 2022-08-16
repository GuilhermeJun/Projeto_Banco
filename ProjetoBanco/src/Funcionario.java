
public class Funcionario {
	// atributos ou propriedades ou variáveis de instância
		String cpf;
		String nome;
		double salario;
		static double valeRefeicao = 1230.00;

		// método para retornar todos os dados
		public String retornarDados() {
			String aux = "";
			aux += "CPF -> " + nome + "\n";
			aux += "Nome -> " + nome + "\n";
			aux += "Salário -> R$ " + salario + "\n";
			return aux;
		}

		// método para aumentar o salário de acordo com uma porcentagem
		public void aumentarSalario(double porcentagem) {
			salario *= (1 + porcentagem / 100);
		}
		
		public void ajustarValeRefeicao(double porcentagem) {
			valeRefeicao *= (1 + porcentagem / 100);
		}
}
