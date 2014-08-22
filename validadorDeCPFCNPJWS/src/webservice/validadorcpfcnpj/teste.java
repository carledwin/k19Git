package webservice.validadorcpfcnpj;

public class teste {

	private static boolean validacao = false;
	private static final String CPF = "cpf"; 
	private static final String CNPJ = "cnpj"; 
	
	public static void main(String[] args) {
		
	System.out.println("Documento " + (validadorCPFCNPJ("cPf", "297.004.758-67") == true ? "valido" : "invalido"));	
	System.out.println("Documento " + (validadorCPFCNPJ("cNpj", "29.753.152/0001-47") == true ? "valido" : "invalido"));	
		
	}
	
	public static boolean validadorCPFCNPJ(String tipoDocumento, String valor){
	
	   
		
		if(CPF.equalsIgnoreCase(tipoDocumento)){
			
			cpf(valor);
		 
		}else if(CNPJ.equalsIgnoreCase(tipoDocumento)){
			
			cnpj(valor);  

		}
		
		return validacao;
	}

	private static void cnpj(String valor) {
		String str_cnpj = valor.replace(".", "").replace("-", "").replace("/", "");
		
		  int soma = 0, aux, dig;  
		   String cnpj_calc = str_cnpj.substring(0,12);  
  
		   if ( str_cnpj.length() != 14 )  
		     validacao =  false;  
  
		   char[] chr_cnpj = str_cnpj.toCharArray();  
  
		   /* Primeira parte */  
		   for( int i = 0; i < 4; i++ )  
		     if ( chr_cnpj[i]-48 >=0 && chr_cnpj[i]-48 <=9 )  
		       soma += (chr_cnpj[i] - 48 ) * (6 - (i + 1)) ;  
		   for( int i = 0; i < 8; i++ )  
		     if ( chr_cnpj[i+4]-48 >=0 && chr_cnpj[i+4]-48 <=9 )  
		       soma += (chr_cnpj[i+4] - 48 ) * (10 - (i + 1)) ;  
		   dig = 11 - (soma % 11);  
  
		   cnpj_calc += ( dig == 10 || dig == 11 ) ?  
		                  "0" : Integer.toString(dig);  
  
		   /* Segunda parte */  
		   soma = 0;  
		   for ( int i = 0; i < 5; i++ )  
		     if ( chr_cnpj[i]-48 >=0 && chr_cnpj[i]-48 <=9 )  
		       soma += (chr_cnpj[i] - 48 ) * (7 - (i + 1)) ;  
		   for ( int i = 0; i < 8; i++ )  
		     if ( chr_cnpj[i+5]-48 >=0 && chr_cnpj[i+5]-48 <=9 )  
		       soma += (chr_cnpj[i+5] - 48 ) * (10 - (i + 1)) ;  
		   dig = 11 - (soma % 11);  
		   cnpj_calc += ( dig == 10 || dig == 11 ) ?  
		                  "0" : Integer.toString(dig);
		   
		   validacao = str_cnpj.equals(cnpj_calc);
  }

	private static void cpf(String valor) {
		String strCpf = valor.replace(".", "").replace("-", "");
		
		int     d1, d2;
		int     digito1, digito2, resto;
		int     digitoCPF;
		String  nDigResult;
 
		  d1 = d2 = 0;
		  digito1 = digito2 = resto = 0;
 
		  for (int nCount = 1; nCount < strCpf.length() -1; nCount++)
		  {
		     digitoCPF = Integer.valueOf (strCpf.substring(nCount -1, nCount)).intValue();
 
		     //multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4 e assim por diante.
		     d1 = d1 + ( 11 - nCount ) * digitoCPF;
 
		     //para o segundo digito repita o procedimento incluindo o primeiro digito calculado no passo anterior.
		     d2 = d2 + ( 12 - nCount ) * digitoCPF;
		  };
 
		  //Primeiro resto da divisão por 11.
		  resto = (d1 % 11);
 
		  //Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
		  if (resto < 2)
		     digito1 = 0;
		  else
		     digito1 = 11 - resto;
 
		  d2 += 2 * digito1;
 
		  //Segundo resto da divisão por 11.
		  resto = (d2 % 11);
 
		  //Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior.
		  if (resto < 2)
		     digito2 = 0;
		  else
		     digito2 = 11 - resto;
 
		  //Digito verificador do CPF que está sendo validado.
		  String nDigVerific = strCpf.substring (strCpf.length()-2, strCpf.length());
 
		  //Concatenando o primeiro resto com o segundo.
		  nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
 
		  //comparar o digito verificador do cpf com o primeiro resto + o segundo resto.
		  validacao = nDigVerific.equals(nDigResult);
	}
	
}
