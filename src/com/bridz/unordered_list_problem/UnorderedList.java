package com.bridz.unordered_list_problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

// Singleton pattern
enum getInstance {

	INSTANCE;

	public Scanner getScannerInstance() {
		return new Scanner(System.in);
	}

	public BufferedReader getBufferedReaderInstance() throws IOException {
		return new BufferedReader(new FileReader(
				"C:\\Users\\King\\Documents\\workspace-spring-tool-suite-4-4.6.0.RELEASE\\CoreJava\\src\\UnorderedListOperationFile\\UnorderedOperationFile.txt"));
	}

	public BufferedWriter getBufferedWriterInstance() throws IOException {
		return new BufferedWriter(new FileWriter(
				"C:\\Users\\King\\Documents\\workspace-spring-tool-suite-4-4.6.0.RELEASE\\CoreJava\\src\\UnorderedListOperationFile\\UnorderedOperationFile.txt",
				true));
	}

}

public class UnorderedList {

	public static void main(String args[]) {

		try {
			BufferedReader bufferReader = getInstance.INSTANCE.getBufferedReaderInstance();
			BufferedWriter bufferWriter = getInstance.INSTANCE.getBufferedWriterInstance();

			String fileLines;
			List wordList = new LinkedList();

			System.out.println("Enter the word to delete : ");
			Scanner scanner = getInstance.INSTANCE.getScannerInstance();
			String deleteWord = scanner.next();

			System.out.println("Enter the word to find : ");
			String findWord = scanner.next();

			System.out.println("Enter the word to Append : ");
			String appendWord = scanner.next();

			System.out.println("Enter the word to find index : ");
			String findIndexOfWord = scanner.next();

			System.out.println("Enter the index to inset word : ");
			int indexPosition = scanner.nextInt();

			System.out.println("Enter the word to inset on given index : ");
			String addWordOnIndex = scanner.next();

			while ((fileLines = bufferReader.readLine()) != null) {

				String[] splittedFileLines = fileLines.split(" ");
				for (String eachWord : splittedFileLines)
					// Added new word to linked list
					wordList.add(eachWord);

			}

			// Creating unordered link list using shuffle method of collections
			//Collections.shuffle(wordList);

			// Deleting word from the linked list
			System.out.println(wordList.remove(deleteWord));

			// Searching value in the linked list
			System.out.println(wordList.contains(findWord));

			// Checking list is empty or not
			System.out.println(wordList.isEmpty());

			// Checking size of linked list
			System.out.println(wordList.size());

			// Append word to last position in list
			System.out.println(wordList.add(appendWord));

			System.out.println(wordList);

			// Returns the index position of the item
			System.out.println(findIndexOfWord + " index is : " + wordList.indexOf(findIndexOfWord));

			System.out.println(wordList.set(indexPosition, addWordOnIndex));
			
			System.out.println(wordList);

		} catch (IOException exception) {
			exception.printStackTrace();
		}

	}

}
