package question1;
class Triangle {
	double side1, side2, side3;
    public Triangle() {
    	side1=3;
    	side2=4;
    	side3=5;
    }
    public double calculatePerimeter() {
    	 return side1 + side2 + side3;
        }
    public double calculateArea() {
    	double s=calculatePerimeter() / 2;
      return  Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    
}
}
public class question4 {
	public static void main(String[] args) {
		Triangle obT=new Triangle();
		double Area = obT.calculateArea();
		System.out.println("Area or triangle is: "+Area);
		double Perimeter=obT.calculatePerimeter();
		System.out.println("Perimeter or triangle is: "+Perimeter);

	}

}
