
public class Cliente {
	//atributos ou propriedades ou variáveis de instância
		String nome;
		String cpf;
		Conta conta = new Conta();
		CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
		
		//método para retornar todos os dados
		public String retornarDados() {
			String aux = "";
			aux += "Nome -> " + nome + "\n";
			aux += "CPF -> " + cpf + "\n";
			aux += cartaoDeCredito.retornarDados();
			aux += conta.retornarDados();
			return aux;
		}
}
