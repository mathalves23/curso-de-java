package fundamentos;

public class TipoString {

	public static void main(String[] args) {

		System.out.println("Olá, pessoal".charAt(2));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		System.out.println("Nome: " + nome + " \nSobrenome:" + sobrenome);
		
		System.out.printf("Seu nome é %s %s", nome, sobrenome);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}

}
