package org.qa.testngbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropProg {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\RAM79\\eclipse-workspace\\javaprograms\\TestNGConcepts_Part1\\config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("url"));

	}

}
