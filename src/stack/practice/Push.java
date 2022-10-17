package stack.practice;

import java.util.Stack;

public class Push 
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
		s.push(99);
		System.out.println(s);


	}

}
