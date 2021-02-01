package DependencyInversion;



/* e�er spellchecker olarak tek bir class gibi tan�mlansayd�  emailer class�nda onun parametresini vericektik ve birden fazla
 * methodu kullanamayacakt�k
 * 
 * 
 * In other words. we should design our software in such a way that various modules can be separated 
 * from each other using an abstract layer to bind them together.
 * 
 * */



public interface ISpellChecker {
	
	void check();

}
