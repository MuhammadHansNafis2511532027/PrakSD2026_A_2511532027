package pekan3_2511532027;

public class StackArray_2511532027 {
	static final int MAX_2027 = 1000;
	int top_2027;
	int a_2027[] = new int [MAX_2027];
	boolean isEmpty_2027()
	{
		return (top_2027 < 0);
	}
	StackArray_2511532027()
	{
		top_2027 = -1;
	}
	boolean push_2027 (int x)
	{
		if (top_2027 >= (MAX_2027 - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a_2027[++top_2027] = x;
			System.out.println(x + " ditambahkan dalam stack");
			return true;
		}
	}
	int pop_2027()
	{
		if (top_2027 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a_2027[top_2027--];
			return x;
		}
	}
	int peek_2027()
	{
		if (top_2027 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a_2027[top_2027];
			return x;
		}
	}
	void print_2027() {
		for (int i = top_2027; i > -1; i--) {
			System.out.print(" " + a_2027[i]);
		}
	}
}
