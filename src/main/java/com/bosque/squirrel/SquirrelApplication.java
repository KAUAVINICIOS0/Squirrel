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

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SquirrelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SquirrelApplication.class, args);
    
    List<Float> list = new ArrayList<Float>(List.of(170.1f, 45.2f, 75.3f, 90.5f, 802.2f, 24.4f, 2.2f, 66.5f, 80.1f, 1.6f, 5.2f, 3.2f, 4.1f, 6.8f, 12.6f, 10.3f, 9.3f));

    System.out.println("lista original: "+ list);
    BucketSort bucketSort = new BucketSort();
    List<Float> sortedList = bucketSort.sort(list);
    System.out.println("lista ordenada: "+ sortedList);
	}

}
