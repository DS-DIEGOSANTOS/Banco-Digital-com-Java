package Banco;

public class Cliente {
	
	private String nome;
	private int conta;
	private double saldo = 0;
	private String opera��o; 
	
	Cliente(String nome,int conta, String opera��o) {
		this.nome = nome;
		this.conta = conta;
		this.opera��o = opera��o;
	}
	
	void informa��es() {
		System.out.println("nome:"+nome);
		System.out.println("conta:"+conta);
		System.out.println("opera��o:"+opera��o);
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

	public String getOpera��o() {
		return opera��o;
	}
	
	

	
}
