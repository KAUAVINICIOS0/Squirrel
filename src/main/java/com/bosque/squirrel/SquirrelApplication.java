package com.bosque.squirrel;

import java.util.List;
import com.bosque.algorithms.BubbleSort;
import java.util.ArrayList;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SquirrelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SquirrelApplication.class, args);
    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(6);
    list.add(2);
    
    System.out.println("lista original: "+ list);
    BubbleSort bubbleSort = new BubbleSort();
    List<Integer> sortedList = bubbleSort.sort(list);
    System.out.println("lista ordenada: "+ sortedList);
	}

}
