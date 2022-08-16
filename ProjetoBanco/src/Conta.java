
public class Conta {
	// atributos ou propriedades ou vari�veis de inst�ncia
		int numero;
		double saldo;
		double limite;

		// m�todo para sacar um valor
		public void sacar(double valor) {
			saldo -= valor;
		}
		
		//m�todo para depositar um valor na conta
		public void depositar(double valor) {
			saldo += valor;
		}
		
		//m�todo para retornar o saldo do cliente
		public double consultarSaldo() {
			return saldo;
		}
		
		//transferir dinheiro de uma conta para outra
		public void transferir(Conta destino, double valor) {
			sacar(valor);
			destino.depositar(valor);
		}
		
		public String retornarDados() {
			String aux = "";
			aux += "N�mero da conta -> " + numero + "\n";
			aux += "Saldo -> " + saldo + "\n";
			aux += "Limite do cart�o -> " + limite + "\n";
			return aux;
		}
}
