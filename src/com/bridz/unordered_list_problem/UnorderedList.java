package com.bridz.unordered_list_problem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class UnorderedList {

	public static void main(String args[]) {

		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader(
					"C:\\Users\\King\\Documents\\workspace-spring-tool-suite-4-4.6.0.RELEASE\\CoreJava\\src\\UnorderedListOperationFile\\UnorderedOperationFile.txt"));

			String fileLines;
			List wordList = new LinkedList();
			while ((fileLines = bufferReader.readLine()) != null) {
				System.out.println(fileLines);
				String[] splittedFileLines = fileLines.split(" ");
				for (String eachWord : splittedFileLines) {
					wordList.add(eachWord);
					System.out.println(wordList);
				}
			}

		} catch (IOException exception) {
			exception.printStackTrace();
		}

	}

}
