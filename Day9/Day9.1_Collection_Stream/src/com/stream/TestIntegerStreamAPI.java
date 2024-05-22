package com.stream;

import java.util.function.Consumer;
import java.util.stream.IntStream;

public class TestIntegerStreamAPI {

	public static void main(String[] args) {

        IntStream intStream=IntStream.range(11, 21);
    
       // intStream.forEach(no->System.out.print(no+" "));
		
		
//        //accept(T no)
//        Consumer<Integer> cons=(no)->{System.out.println(no);};
//        
//		cons.accept(345);
        
        //display all even numbers if(no%2==0)
        
        System.out.println("\n----Even Numbers---");
        //filetr:apply condition
       // intStream.filter(no->no%2==0).forEach(no->System.out.println(no));
        
        
        
        System.out.println("\n----  Numbers >25---");
         
       // intStream.filter(no->no>=15).forEach(no->System.out.println(no));
        
        
        IntStream intStream1=IntStream.of(3,43,23,44,56,86,45,781,2,56);
        
//        intStream1.forEach(i->System.out.println(i));
//        
//        System.out.println(intStream1.count());
//        System.out.println(intStream1.sum());
//        
//        System.out.println(intStream1.max());
//        
//        System.out.println(intStream1.min());
//        System.out.println(intStream1.average());
        
     int i=   intStream1.filter(no->no%2==0).sum();
        System.out.println("Sum="+i);
        
        
        
	}

}
