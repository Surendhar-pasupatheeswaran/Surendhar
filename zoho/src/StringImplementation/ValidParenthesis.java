package StringImplementation;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis {
		  public static boolean isValid(String s) {
		    Deque<Character> stack = new ArrayDeque<>();

		    for (final char c : s.toCharArray())
		      if (c == '(')
		        stack.push(')');
		      else if (c == '{')
		        stack.push('}');
		      else if (c == '[')
		        stack.push(']');
		      else if (stack.isEmpty() || stack.pop() != c)
		        return false;

		    return stack.isEmpty();
		  }
		

	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));

		System.out.println(isValid("(]{"));
	}

}
