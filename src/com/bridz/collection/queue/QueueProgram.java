package com.bridz.collection.queue;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProgram {

	public static void main(String args[]) {

		PriorityQueue queue = new PriorityQueue();
		ArrayList arrayList = new ArrayList();

		for (int tempoarayValue = 1; tempoarayValue < 6; tempoarayValue++) {
			queue.add(tempoarayValue);
			arrayList.add(tempoarayValue);
		}

		queue.forEach(data -> System.out.print(data + " "));
		System.out.println();

		System.out.println(queue.poll());
		queue.forEach(data -> System.out.print(data + " "));
		System.out.println();

		System.out.println(queue.remove());
		queue.forEach(data -> System.out.print(data + " "));
		System.out.println();

		System.out.println(queue.peek());

		System.out.println(queue.element());

		// Converting from array list to queue
		PriorityQueue queue2 = new PriorityQueue(arrayList);
		queue2.offer(7);
		queue2.forEach(data -> System.out.print(data + " "));
		System.out.println();

	}
}
