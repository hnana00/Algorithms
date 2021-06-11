package com.hanna.basic401;

import com.hanna.basic401.IntStack2.AorB;

public class test {

	public static void main(String[] args) {
		
		int max = 7;
		
		IntStack2 stack = new IntStack2(max);
		
		stack.push( AorB.StackA, 5 );
		stack.push( AorB.StackA, 10 );
		stack.push( AorB.StackA, 15 );
		
		stack.push( AorB.StackB, 20 );
		stack.push( AorB.StackB, 25 );
		stack.push( AorB.StackB, 30 );
		
		stack.dump(AorB.StackA);
		stack.dump(AorB.StackB);
		
		stack.pop(AorB.StackA);
		stack.pop(AorB.StackB);
		
		boolean cheak = stack.isFull();
		System.out.println(cheak);
		
		stack.dump(AorB.StackA);
		stack.dump(AorB.StackB);
		
		stack.clear(AorB.StackA);
		stack.clear(AorB.StackB);
		
		boolean emptyStackA = stack.isEmpty(AorB.StackA);
		System.out.println(emptyStackA);
		
		boolean emptyStackB = stack.isEmpty(AorB.StackB);
		System.out.println(emptyStackB);
		
	}
}
