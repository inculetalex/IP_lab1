
public abstract class Shape {
	protected double area;
	protected String name;
	Shape(){
	}
	public void getArea() {
		System.out.println(name + " area is " + area);
	}
	public abstract void onAreaChange();
}
