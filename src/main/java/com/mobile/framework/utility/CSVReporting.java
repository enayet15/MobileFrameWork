package com.mobile.framework.utility;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.opencsv.CSVWriter;

public class CSVReporting {

	public static CSVWriter csvWriter;
	public static List<String[]> reportData= new ArrayList<String[]>();

	// This method is to get current date and time
	public String currentDate() {
		Date d = Calendar.getInstance().getTime(); // Current time
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH_mm");
		String currentData = sdf.format(d);
		return currentData;
	}

	public void createCSVFile(String filePath) throws IOException {
		csvWriter = new CSVWriter(new FileWriter(filePath));
	}

	public void writeReportingColumn(String columnString) {

		String[] columnHeaders = columnString.split("#");
		System.out.println(columnHeaders.length);
		csvWriter.writeNext(columnHeaders);

	}

	/*public String testCaseStatus(boolean status) {
		String testCaseStatus = "";
		if (status) {
			testCaseStatus = "Pass";
		} else {
			testCaseStatus = "Fail";
		}

		return testCaseStatus;
	}*/

	public void writeIntoCSVReport(List<String[]> reportList) {
		for (int i = 0; i < reportList.size(); i++) {
			System.out.println("Size : " + reportList.size());
			csvWriter.writeNext(reportList.get(i));
		}
	}
	
	public static void closeCsvWriter() throws IOException {
		if (csvWriter != null)
			csvWriter.close();
	}
	
	
	/*
	 * Before Suite
	 * String fileName = workingDir + "/" + "csvReport" + "/" + currentDate() + "_report.csv";
		csvWriter = new CSVWriter(new FileWriter(fileName));
		writeReportingColumn(getPropertyValue("reportColumn"));
	 * 
	 * 
	 * @AfterSuite
	public void tearDown() throws IOException{
		writeIntoCSVReport(reportData);
		closeCsvWriter();
	}
	
	public static Properties readPropertiesFile() throws IOException {
		File file = new File(System.getProperty("user.dir") + "/data/data.properties");
		prop = new Properties();
		FileInputStream io = new FileInputStream(file);
		prop.load(io);
		return prop;
	}

	public static String getPropertyValue(String key) throws IOException {
		return readPropertiesFile().getProperty(key);
	}
	 * 
	 * 
	 * <!-- https://mvnrepository.com/artifact/com.opencsv/opencsv -->
		<dependency>
			<groupId>com.opencsv</groupId>
			<artifactId>opencsv</artifactId>
			<version>3.3</version>
		</dependency>
	 * 
	 */
}
