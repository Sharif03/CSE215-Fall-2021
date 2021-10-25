package theoryLec03;

import java.util.Iterator;

public class WhileLoopProblemByZHOLec03 {

	public static void main(String[] args) {
		int i =100, j= 200;
		
		while(++i < --j);
		System.out.println(i);  // 150
		
		int k;
	    for (k = 0; k < 10; k++); 
	    	System.out.println(k);  // 10
	}

}
