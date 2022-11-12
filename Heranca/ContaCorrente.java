public class ContaCorrente extends ContaBancaria {

  private double limiteCredito;

  public ContaCorrente(int numero, int agencia, double limite) {
    super(numero,agencia);
    this.limiteCredito = limite;

  }

  public double GetlimiteCredito() {
    return this.limiteCredito;
  }
  public double ConsultarSaldo(){
    return GetlimiteCredito();
  }

}