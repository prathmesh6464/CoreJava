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

enum GetInstance {

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
			BufferedReader bufferReader = GetInstance.INSTANCE.getBufferedReaderInstance();
			BufferedWriter bufferWriter = GetInstance.INSTANCE.getBufferedWriterInstance();

			String fileLines;
			List<Object> wordList = new LinkedList<Object>();

			System.out.println("Enter the word : ");
			Scanner scanner = GetInstance.INSTANCE.getScannerInstance();
			String findWord = scanner.next();

			while ((fileLines = bufferReader.readLine()) != null) {
				String[] splittedFileLines = fileLines.split(" ");
				for (String eachWord : splittedFileLines)
					wordList.add(eachWord);

			}

			Collections.shuffle(wordList);

			bufferReader.close();

			if (wordList.contains(findWord)) {
				System.out.println(wordList);
				wordList.remove(findWord);
				wordList.stream().forEach(word -> {
					try {
						bufferWriter.write(" " + word.toString());

					} catch (Exception exception) {
						exception.printStackTrace();
					}
				});

				bufferWriter.close();

				System.out.println(wordList);

			} else {
				System.out.println(wordList);
				wordList.add(findWord);
				wordList.stream().forEach(word -> {
					try {
						bufferWriter.write(" " + word.toString());

					} catch (Exception exception) {
						exception.printStackTrace();
					}
				});
				bufferWriter.close();
				System.out.println(wordList);
				bufferWriter.close();
			}

		} catch (IOException exception) {
			exception.printStackTrace();
		}

	}

}