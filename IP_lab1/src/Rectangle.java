
public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	Rectangle(){
		name = "Rectangle";
		width=1;
		height=1;
		onAreaChange();
	}
	Rectangle(double width, double height){
		name = "Rectangle";
		this.width=width;
		this.height=height;
		onAreaChange();
	}
	
	public void onAreaChange() {
		area = width * height;
	}

	public void setWidth(double width) {
		this.width = width;
		onAreaChange();
	}

	public void setHeight(double height) {
		this.height = height;
		onAreaChange();
	}
}
