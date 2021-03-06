package Banco;

import java.util.ArrayDeque;

public abstract class Conta {
	
	final Cliente cliente;
	final ArrayDeque<String> extratos = new ArrayDeque<String>();
	
	protected Conta(String nome, int conta,String opera??o) {
		this.cliente = new Cliente(nome,conta,opera??o);
	}
	
	
	//servi?os bancarios
	public boolean deposito(double valor) {
		if(valor>0) {
			valor +=cliente.getSaldo();
			cliente.setSaldo(valor);
			String extrato = "Deposito:"+valor;
			this.extratos.add(extrato);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean sacar(double valor) {
		if(cliente.getSaldo()>=valor && valor>0) {
			double saldo = cliente.getSaldo() - valor;
			cliente.setSaldo(saldo);
			String extrato = "sacar:"+(valor*-1);
			this.extratos.add(extrato);
			return true;
		}else {
			return false;
		}
	}
	
	
	public boolean transferencia(double valor, Conta conta) {
		if(cliente.getSaldo()>=valor && valor >0 ) {

			double saldo = cliente.getSaldo() - valor;
			conta.deposito(valor);
			cliente.setSaldo(saldo);
			
			String extrato = "transferencia:"+(valor*-1)+"  conta:"+conta.cliente.getConta();
			this.extratos.add(extrato);
			
			return true;
		}else {
			return false;
		}
	}
	
	public void extrato() {
		
		System.out.println("*****************");
		System.out.println("      extrato    ");
		System.out.println("*****************");
		
		for (String extrato : extratos) {
			System.out.println(extrato);
		}
		
		System.out.println("-------------------");
		System.out.println("Saldo:         "+cliente.getSaldo());
	}

}
