package DependencyInversion;



/* eğer spellchecker olarak tek bir class gibi tanımlansaydı  emailer classında onun parametresini vericektik ve birden fazla
 * methodu kullanamayacaktık
 * 
 * 
 * In other words. we should design our software in such a way that various modules can be separated 
 * from each other using an abstract layer to bind them together.
 * 
 * */



public interface ISpellChecker {
	
	void check();

}
