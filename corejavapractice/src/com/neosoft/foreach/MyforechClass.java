package com.neosoft.foreach;

import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;

public class MyforechClass {
	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
			
		}
		list.forEach(new Consumer<Integer>()
		{

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
			
		});
		
		
	}

}
