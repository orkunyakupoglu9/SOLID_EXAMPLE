package DependencyInversion;


/* abstraction interface ile sa�land� class interface instance ald� b�ylelikle
 *  t�m classlar� isted�imiz zaman ortak methodda �a��rabildik*/



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
