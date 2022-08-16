
public class Conta {
	// atributos ou propriedades ou variáveis de instância
		int numero;
		double saldo;
		double limite;

		// método para sacar um valor
		public void sacar(double valor) {
			saldo -= valor;
		}
		
		//método para depositar um valor na conta
		public void depositar(double valor) {
			saldo += valor;
		}
		
		//método para retornar o saldo do cliente
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
			aux += "Número da conta -> " + numero + "\n";
			aux += "Saldo -> " + saldo + "\n";
			aux += "Limite do cartão -> " + limite + "\n";
			return aux;
		}
}
