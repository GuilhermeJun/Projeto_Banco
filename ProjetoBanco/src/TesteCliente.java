
public class TesteCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.nome = "Selmini";
		c1.cpf = "123.456.789-97";
		c1.cartaoDeCredito.numero = 1000;
		c1.cartaoDeCredito.totalFatura = 5000.00;
		c1.conta.numero = 654364615;
		c1.conta.saldo = 1000.00;
		c1.conta.limite = 10000.00;
		
		System.out.println(c1.retornarDados());
	}

}
