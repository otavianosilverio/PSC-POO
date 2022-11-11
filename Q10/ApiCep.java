package Q10;

public class ApiCep {

	 private String cep;
	 private String logradouro;
	 private String complemento;
	 private String uf;
	 private String ibge;
	 private String gia;
	 private String ddd;
	 private String siafi;
	 public String getCep() {
		return cep;
	 }
	 public String getLogradouro() {
		return logradouro;
	 }
	 public String getComplemento() {
		return complemento;
	 }
	 public String getUf() {
		return uf;
	 }
	 public String getIbge() {
		return ibge;
	 }
	 public String getGia() {
		return gia;
	 }
	 public String getDdd() {
		return ddd;
	 }
	 public String getSiafi() {
		return siafi;
	 }
	 
	 // Metodo que Busca na APi
	 public void ConsultarCep(String Cep) {
		 String json = "https://viacep.com.br/ws/01001000/json";
		 this.cep = "090";
		 this.logradouro = "rua ";
		 
	 }

	
	
	
}
