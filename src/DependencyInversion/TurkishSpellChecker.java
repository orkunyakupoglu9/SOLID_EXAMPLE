package DependencyInversion;

public class TurkishSpellChecker implements ISpellChecker {

	@Override
	public void check() {
		
		System.out.println("Checked in turkish");
		
	}

}
