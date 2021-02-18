
public class Circle extends Shape {
	private double radius;
	private final double pi = 3.141;
	Circle(){
		name = "Cicle";
		radius = 1;
		onAreaChange();
	}
	Circle(double radius){
		name = "Cicle";
		this.radius = radius;
		onAreaChange();
	}
	public void onAreaChange() {
		area = pi*pi*radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
		onAreaChange();
	}
	
}
