public class TestaConta {
	public static void main(String[] args) {
		
		Banco b = new Banco(100);
		Conta cp = new ContaPoupanca();
		Conta cc = new ContaCorrente();
		Conta cc2 = new ContaCorrente();
		
		cp.setNome("Nome da CP");
		cp.setSaldo(1000);
		
		cc.setNome("Nome da CC");
		cc.setSaldo(1000);
		
		
		cc2.setNome("Nome da CC");
		cc2.setSaldo(100);		
		
		b.adiciona(cc);
		b.adiciona(cp);
		b.adiciona(cc2);
		
		b.pegaConta(0);
		b.pegaConta(1);
		b.pegaConta(2);
		
		System.out.println(b.pegaTotalDeContas());
		
		
	}
}
