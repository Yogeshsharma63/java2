package question1;
class Student {
    String name;
    int roll_no;
    public Student() {
        roll_no = 2;
        name = "John";
    }
}
public class Students {

	public static void main(String[] args) {
		Student student = new Student();
        System.out.println("Name: " + student.name);
        System.out.println("Roll No: " + student.roll_no);

	}

}
