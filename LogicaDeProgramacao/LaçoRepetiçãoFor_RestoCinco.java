package LogicaDeProgramacao;
public class LaçoRepetiçãoFor_RestoCinco {
	public static void main (String args[])
	{//Informar todos os números de 1000 a 1999 
	//que quando divididos por 11 obtemos resto = 5.
		
		int i;
		
		for(i=1000; i<=1999; i++)
		{
			if(i%11==5)
			{
				System.out.println(i+ "");
			}
		}
	}
}
