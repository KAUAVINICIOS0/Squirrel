package com.bosque.squirrel;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

import com.bosque.algorithms.BubbleSort;
import com.bosque.algorithms.SelectionSort;
import com.bosque.algorithms.MergeSort;
import com.bosque.algorithms.QuickSort;
import com.bosque.algorithms.InsertionSort;
import com.bosque.algorithms.HeapSort;
import com.bosque.algorithms.CountingSort;
import com.bosque.algorithms.ShellSort;
import com.bosque.algorithms.RadixSort;
import com.bosque.algorithms.BucketSort;
import com.bosque.algorithms.TimSort;
import com.bosque.algorithms.GnomeSort;
import com.bosque.algorithms.BogoSort;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SquirrelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SquirrelApplication.class, args);

    List<Integer> list = new ArrayList<Integer>(List.of(170, 45, 75, 90, 10, 9));

    System.out.println("lista original: "+ list);
    BogoSort bogoSort = new BogoSort();
    List<Integer> sortedList = bogoSort.sort(list);
    System.out.println("lista ordenada: "+ sortedList);
	}

}
