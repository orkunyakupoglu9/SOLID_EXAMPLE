package DependencyInversion;



/* eðer spellchecker olarak tek bir class gibi tanýmlansaydý  emailer classýnda onun parametresini vericektik ve birden fazla
 * methodu kullanamayacaktýk
 * 
 * 
 * In other words. we should design our software in such a way that various modules can be separated 
 * from each other using an abstract layer to bind them together.
 * 
 * */



public interface ISpellChecker {
	
	void check();

}
