package question1;
class student1{
	String name,address;
    int roll_no;
     long phone_no;
    public void printDetail() {
    	System.out.println("Student name is"+name);
    	System.out.println("Student address is"+address);
    	System.out.println("Student roll_no is"+roll_no);
    	System.out.println("Student phone_no is"+phone_no);
	
}
}
public class question3 {

	public static void main(String[] args) {
		student1 obj = new student1();
		obj.name="Sam";
		obj.address="house no 316 mathura vrindavan";
		obj.roll_no=21;
		obj.phone_no=6398447064l;
		student1 obj1 = new student1();
		obj1.name="John";
		obj1.address="house no 317 mathura vrindavan";
		obj1.roll_no=22;
		obj1.phone_no=6398447065l;
		obj.printDetail();
		obj1.printDetail();
	}

}

