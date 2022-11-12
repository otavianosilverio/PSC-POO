public class ContaPoupanca extends ContaBancaria {

  private double rendimento;

  public ContaPoupanca(int numero, int agencia, double rendimentos) {
    super(numero,agencia);
    this.rendimento = rendimentos;

  }

  public double GetRendimentos() {
    return this.rendimento;
  }

}