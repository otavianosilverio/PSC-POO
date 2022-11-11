class Main {
  public static void main(String[] args) {
    double saldototal;
    System.out.println("Criar um classe do cliente Renan");
    
    ContaCorrente PF0901 = new ContaCorrente(10909,1025,100);
    
    //PF0901.numero = 10909;
   // PF0901.agencia = 1025;
    
    PF0901.depositar(1000);
    PF0901.SetNumero(10910);
    System.out.println("Numero da Conta + Agencia -> "+PF0901.GetNumero()+" - "+PF0901.getAgencia());
    System.out.println("Saldo da conta PF0901 "+PF0901.ConsultarSaldo());
    System.out.println("Limite da COnta Corrente PF0901 "+PF0901.GetlimiteCredito());

    saldototal = (PF0901.ConsultarSaldo()+PF0901.GetlimiteCredito());
    System.out.println("Saldo total da conta PF0901 "+saldototal);
  }  
}