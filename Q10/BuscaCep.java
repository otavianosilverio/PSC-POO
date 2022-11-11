package Q10;

public class BuscaCep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApiCep cep1 = new ApiCep();
		cep1.ConsultarCep("090000");
		System.out.println("Complemento = "+cep1.getComplemento());
		System.out.println("Logradouro = "+cep1.getLogradouro());

	}

}
