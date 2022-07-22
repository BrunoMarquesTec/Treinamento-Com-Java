
public class TestaInterfaces {
	
	public static void main(String[] args) {
		 
		  CalculadorDeImposto imposto = new CalculadorDeImposto();
		  
		  ContaCorrente cc = new ContaCorrente(111, 222);
		  cc.deposita(100);
		  
		  SeguroDeVida seguro = new SeguroDeVida();
		  
		   imposto.registro(cc);
		   imposto.registro(seguro);
		   
		   System.out.println(imposto.getTotalImposto());
				 
	}

}
