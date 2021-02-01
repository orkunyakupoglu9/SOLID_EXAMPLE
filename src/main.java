import DependencyInversion.Emailer;
import DependencyInversion.ISpellChecker;
import DependencyInversion.SpellChecker;
import DependencyInversion.TurkishSpellChecker;
import OpenClosed.ColoredGuitars;

public class main {
	
	
	public static void main(String[] args) {
		
		
		ColoredGuitars guitar=new ColoredGuitars("1979","model",20,"yellow");
		
		
		
		System.out.println(guitar.getModel());
		
		
		ISpellChecker turkish=new TurkishSpellChecker();
		ISpellChecker defaultone=new SpellChecker();
		
		
		new Emailer(turkish).checkEmail();
		new Emailer(defaultone).checkEmail();
		
		
		
		
	}
	
	

}
