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

//Creating 
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

			//Created empty list
			List wordList = new LinkedList();

			System.out.println("Enter the word : ");
			Scanner scanner = getInstance.INSTANCE.getScannerInstance();
			String findWord = scanner.next();

		} catch (

		IOException exception) {
			exception.printStackTrace();
		}

	}

}
