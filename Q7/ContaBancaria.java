public class ContaBancaria {
  // Atributos da minha classe
   private int numero, agencia;
   private double saldo;
  // Metodos Construtor da classe
   public ContaBancaria(int numeroConta,int agenciaConta){
     this.numero = numeroConta;
     this.agencia = agenciaConta;
     this.saldo = 0;
   }
 
public int getAgencia() {
	return agencia;
}
public void setAgencia(int agencia) {
	this.agencia = agencia;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
// Demais metodos da classe
   public int GetNumero(){
     return this.numero;
   }
   public void SetNumero(int numero){
     this.numero = numero;
   }
   public boolean sacar(double valor){
    if (valor <= saldo){
      saldo = saldo - valor;
      return true;
    }else{
      return false;
    }     
  }
   public void depositar(double valor){
    saldo = saldo + valor;
  }  
   public double ConsultarSaldo(){
    return saldo;
  }
    
}

   