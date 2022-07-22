public class TesteContas {

	public static void main(String[] args) {
		
		Conta conta = new ContaPoupanca(1337, 23334); // APÓS DEFINIR A CLASSE CONTA COMO ABSTRATA, NÃO SE PODE MAIS CRIAR UM OBJETO CONTA. 
		                                        // PODE SER CRIADO SOMENTE CONTA POUPANÇA OU CONTA CORRENTE.
		conta.deposita(200.0);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia(570);
		
		System.out.println(conta.getAgencia());
		
		System.out.println("o total de contas é : " + Conta.getTotal());
		
	}
	
}
