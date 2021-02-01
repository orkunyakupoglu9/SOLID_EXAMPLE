package DependencyInversion;

public class SpellChecker implements ISpellChecker {

	@Override
	public void check() {
		
		System.out.println("Checked in English");
		
	}

}
