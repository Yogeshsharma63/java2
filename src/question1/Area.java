package question1;
import java.util.Scanner;
class Area {
    int length;
    int breadth;

    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        int breadth = sc.nextInt();

        Area obj = new Area();
        obj.setDim(length, breadth); // Set the dimensions
        int area = obj.getArea(); // Calculate the area

        System.out.println("Area of rectangle is: " + area);
    }
}
