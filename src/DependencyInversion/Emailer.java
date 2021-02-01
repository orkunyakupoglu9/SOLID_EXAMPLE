package DependencyInversion;


/* abstraction interface ile saðlandý class interface instance aldý böylelikle
 *  tüm classlarý istedðimiz zaman ortak methodda çaðýrabildik*/



public class Emailer {
	
	private ISpellChecker spellchecker;

	public Emailer(ISpellChecker spellchecker) {
		super();
		this.spellchecker = spellchecker;
	}
	
	public void checkEmail()
	{
		this.spellchecker.check();
	}
	

}
