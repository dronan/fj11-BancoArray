public class Banco {

	Conta[] conta;
	
	AtualizadorDeContas ac = new AtualizadorDeContas();
	
	Banco(){
		
	}
	
	Banco(int total){
		this();
		conta = new Conta[total];
	}
	
	public void adiciona (Conta c){
		for (int i = 0; i < conta.length; i++) {
			if ( conta[i] == null ){
				ac.setTotalDeContas(ac.getTotalDeContas() + 1);
				conta[i] = c;
				break;
			}
		}
	}
	
	public void pegaConta(int x) {
			System.out.println(conta[x].getNome());
			System.out.println(conta[x].getSaldo());
			System.out.println(conta[x].tipoConta());
	}

	public int pegaTotalDeContas() {
		int totalContas = 0;
		for (int i = 0; i < conta.length; i++) {
			if ( conta[i] != null )
					totalContas++;
		}
		return totalContas;
	}
	
}
