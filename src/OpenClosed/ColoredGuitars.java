package OpenClosed;

public class ColoredGuitars extends Guitar {

	public String color;
	
	
	
	public ColoredGuitars(String make, String model, int volume,String color) {
		super(make, model, volume);
		this.color=color;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	
	
	
}
