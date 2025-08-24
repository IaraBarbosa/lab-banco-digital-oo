
public class Main {

	public static void main(String[] args) {

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		Banco banco = new Banco();
		banco.setNome("Banco do Brasil");
		banco.setConta(cc);
		banco.setConta(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		banco.imprimirClientesBanco();
	}

}
