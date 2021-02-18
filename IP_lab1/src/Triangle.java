public class Triangle extends Shape {

	private double base;
	private double height;
	Triangle(){
		name = "Triangle";
		base=1;
		height=1;
		onAreaChange();
	}
	Triangle(double base, double height){
		name = "Triangle";
		this.base=base;
		this.height=height;
		onAreaChange();
	}
	public void setBase(double base) {
		this.base = base;
		onAreaChange();
	}
	public void setHeight(double height) {
		this.height = height;
		onAreaChange();
	}
	public void onAreaChange() {
		area = base * height;
	}
}
