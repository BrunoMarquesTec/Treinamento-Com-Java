
public class ContaCorrente extends Conta implements Tributavel {
         
	public ContaCorrente(int agencia, int numero) {   //O CONSTRUTOR ESPECÍFICO NÃO PODE SER HERDADO, LOGO É PRECISO DEFINIR OUTRO, E PODE SER
		super(agencia,numero);                  // PASSADO A REFERENCIA COM A PALAVRA SUPER, PARA REFERENCIAR O CONSTRUTOR DA CLASSE MÃE.        
	}
	
	 @Override
	public boolean saca(double valor) {
		double ValoraSacar = valor + 0.10;
		return super.saca(ValoraSacar);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 2;
	
	}


}
