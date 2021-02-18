/*
 * Am creat un vector de 3 elemente de tip Shape ( clasa abstracta ce contine 2 campuri: arie si numele formei )
 * pe aceste elemente le am instantiat cu 3 forme diferite si am afisat
 * la fiecare ariile corespunzatoare
 * 
 */
public class App {

	public static void main(String[] args) {
		Shape s1 = new Circle(23.34);
		Shape s2 = new Triangle(4,21);
		Shape s3 = new Rectangle(2.2,2.34);
		s1.getArea();
		s2.getArea();
		s3.getArea();
	}
	

}
