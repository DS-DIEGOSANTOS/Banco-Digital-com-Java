package Banco;

public class Main {

	public static void main(String[] args) {
		
		Conta cc = new Corrente("Diego", 589);
		Conta cp = new Poupança("daniel", 510);
		
		cc.cliente.informações();
		
		cc.deposito(500);
		cc.transferencia(50, cp);
		cp.sacar(25);
		
		cc.extrato();
		cp.extrato();

	}

}
