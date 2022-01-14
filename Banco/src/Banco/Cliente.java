package Banco;

public class Cliente {
	
	private String nome;
	private int conta;
	private double saldo = 0;
	private String operação; 
	
	Cliente(String nome,int conta, String operação) {
		this.nome = nome;
		this.conta = conta;
		this.operação = operação;
	}
	
	void informações() {
		System.out.println("nome:"+nome);
		System.out.println("conta:"+conta);
		System.out.println("operação:"+operação);
		System.out.println("saldo:"+saldo);
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		
		if(saldo >= 0) {
			this.saldo = saldo;
		}
		
	}

	public String getNome() {
		return nome;
	}

	public int getConta() {
		return conta;
	}

	public String getOperação() {
		return operação;
	}
	
	

	
}
