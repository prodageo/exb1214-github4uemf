public class Principal
{
	public static void main(String[]args)
    {
		// commande > java Main.class mot
		// décomposition de la commande :
		// - nom de la commande : java
		// - argument 1 : fichier "compilé" de bytecode chargée : Main.class
		// - argument 2 : paramètre 1 du programme Main.class
		// rappel : la commande java chargé en RAM le bytecode de la classe qui va utilisé la CPU pour s'éxécuter.
		
		String motAverifier = args[0] ; // args[0] correspond à l'argument 2 de la commande java
		
		boolean isPalindrome = Palindrome.is_palindrome(motAverifier) ;
		
		System.out.println("----------------------------------------------------");
		// System.out.println("Input : ", "- Output : " );
		System.out.println("Input : " + motAverifier + "- Output : " + isPalindrome );		
		System.out.println("----------------------------------------------------");		
	}

}
