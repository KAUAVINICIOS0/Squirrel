package com.bosque.squirrel;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

import com.bosque.algorithms.BubbleSort;
import com.bosque.algorithms.SelectionSort;
import com.bosque.algorithms.MergeSort;
import com.bosque.algorithms.QuickSort;
import com.bosque.algorithms.InsertionSort;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SquirrelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SquirrelApplication.class, args);
    
    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(6);
    list.add(0);
    list.add(1);
    list.add(7);

    System.out.println("lista original: "+ list);
    InsertionSort insertionSort = new InsertionSort();
    List<Integer> sortedList = insertionSort.sort(list);
    System.out.println("lista ordenada: "+ sortedList);
	}

}
