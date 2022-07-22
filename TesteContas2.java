
public class TesteContas2 {

	public static void main(String[] args) {
		
      ContaCorrente cc = new ContaCorrente(111,222);
      cc.deposita(100);
      
      ContaPoupanca cp = new ContaPoupanca(111, 222);
      cp.deposita(200);
      
      cc.transfere(10.0, cp);
      
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
   

	}

}
