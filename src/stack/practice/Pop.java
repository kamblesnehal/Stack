package stack.practice;

import java.util.Stack;

public class Pop 
{
	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.add(90);
		s.add(56);
		s.add(54);
		s.add(90);
		s.add(44);
		s.add(77);
		System.out.println(s);
		System.out.println(s.pop());

	}

}
