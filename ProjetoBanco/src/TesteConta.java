
public class TesteConta {

	public static void main(String[] args) {
		Conta junzaum = new Conta();
		junzaum.saldo = 1500;
		
		Conta mario = new Conta();
		mario.saldo = 2000;

		mario.transferir(junzaum, 500);
		
		System.out.println("Mario -> " + mario.saldo);
		System.out.println("Junzaum -> " + junzaum.saldo + "\n");
		
		junzaum.transferir(mario, 700);
		
		System.out.println("Mario -> " + mario.saldo);
		System.out.println("Junzaum -> " + junzaum.saldo);
	}

}
