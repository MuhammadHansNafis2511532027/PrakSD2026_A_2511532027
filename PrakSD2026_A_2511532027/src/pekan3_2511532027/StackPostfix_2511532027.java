package pekan3_2511532027;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511532027 {
	public static int postfixEvaluate(String expression_2027) {
		Stack<Integer> s_2027 = new Stack<Integer>();
		Scanner input_2027 = new Scanner(expression_2027);
		while (input_2027.hasNext()) {
			if (input_2027.hasNextInt()) { // an operand (integer)
				s_2027.push(input_2027.nextInt());
			} else { // an operator
				String operator_2027 = input_2027.next();
				int operand2_2027 = s_2027.pop();
				int operand1_2027 = s_2027.pop();
				if (operator_2027.equals("+")) {
					s_2027.push(operand1_2027 + operand2_2027);
				} else if (operator_2027.equals("-")) {
					s_2027.push(operand1_2027 - operand2_2027);
				} else if (operator_2027.equals("*")) {
					s_2027.push(operand1_2027 * operand2_2027);
				} else {
					s_2027.push(operand1_2027 / operand2_2027);
				}
			}
		}
		input_2027.close();
		return s_2027.pop();
	}
	public static void main(String[] args) {
		System.out.println("Hasil postfix = " + postfixEvaluate("5 2 4 * + 7 -"));
	}
}
