class Main {
  public static void main(String[] args) {
    double saldototal;
    System.out.println("Criar um classe Conta");

    ContaCorrente conta1 = new ContaCorrente(123,456,100.00);
conta1.depositar(1000.00);
    
    System.out.println("Saldo da conta "+conta1.ConsultarSaldo());
    System.out.println("Limite "+conta1.GetlimiteCredito());
    
   
  }  
}