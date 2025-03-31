package view;

import controller.StackController;

public class Principal {

	public static void main(String[] args) {
		StackController stack = new StackController();
		int[] array =  {0,5,7,-4,3,5,-2,-1,10,4,3,-6,2,-9,1,-5};
		stack.postiveOrNegativeArray(array,array.length);
	}

	

}
