package com.bridz.collection.stack;

import java.util.Stack;

public class StackProgram {

	public static void main(String args[]) {

		Stack stack = new Stack();

		System.out.println(stack.empty()); // true

		stack.push(7);
		stack.push("prathamesh");
		stack.push(19);
		stack.push("sandip");

		System.out.println(stack.empty()); // false

		// Reading stack values
		stack.forEach(data -> System.out.print(data + " "));
		System.out.println();

		System.out.println(stack.peek()); // sandip (return top of the stack)

		System.out.println(stack.pop()); // sandip

		// Reading Stack values
		stack.forEach(data -> System.out.print(data + " "));
		System.out.println();

		System.out.println(stack.search(7)); // Returned offset value 3

		System.out.println(stack.search("sandip")); // Return -1 because sandip is not preset in stack
	}

}
