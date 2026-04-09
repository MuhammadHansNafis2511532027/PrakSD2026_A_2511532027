package pekan3_2511532027;

public class StackArrayDriver_2511532027 {
	public static void main(String[] args) {
		StackArray_2511532027 s = new StackArray_2511532027();
		s.push_2027(10);
		s.push_2027(20);
		s.push_2027(30);
		System.out.println(s.pop_2027() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah : " + s.peek_2027());
		System.out.print("Elemen pada stack : ");
		s.print_2027();
	}
}
