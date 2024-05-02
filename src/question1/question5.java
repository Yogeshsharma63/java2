package question1;
class Triangle1 {
	double side1, side2, side3,Area,Perimeter;
    
    public double calculatePerimeter() {
    	 return side1 + side2 + side3;
    }
    public double calculateArea() {
    	double s=calculatePerimeter() / 2;
      return  Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public void printDetail() {
    	double Area = calculateArea();
    	double Perimeter = calculatePerimeter();
    	System.out.println("Area or triangle is: "+Area);
    	System.out.println("Perimeter or triangle is: "+Perimeter);
    }
    }

public class question5 {

	public static void main(String[] args) {
		Triangle1 obj=new Triangle1();
		obj.side1=3;
		obj.side2=4;
		obj.side3=5;
		obj.printDetail();
	}
	}


