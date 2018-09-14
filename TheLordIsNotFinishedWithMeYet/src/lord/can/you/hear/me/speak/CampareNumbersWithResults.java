package lord.can.you.hear.me.speak;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CampareNumbersWithResults {
	
	public static void main(String args[]) {
		BufferedReader bufferedReader = null;
		try {
			String fileName = "C:\\SIYANDAMANISI\\Mine\\TheLordIsNotFinishedWithMeYet\\TheLordIsNotFinishedWithMeYet.txt";
			FileReader fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);
			String record = null;
			List<Integer> resultsList = new ArrayList<Integer>();
			resultsList.add(23);
			resultsList.add(21);
			resultsList.add(16);
			resultsList.add(22);
			resultsList.add(2);
			resultsList.add(6);
			resultsList.add(29);
			int recordId = 0;
			while ((record = bufferedReader.readLine()) != null) {
				recordId++;
				String[] splitRecord = record.split(",");
				int counter = 0;
				for (String number: splitRecord) {
					int numberInteger = Integer.valueOf(number);
					
					if (resultsList.contains(numberInteger)) {
						counter++;
					}
				}
				System.out.println("Numbers matching: " + counter + " Record Number: " + recordId);
			}
		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("Fine not found");
		} catch (IOException ioException) {
			System.out.println("Error reading file");
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException ioException) {
				System.out.println("Error closing buffered reader...");
			}
		}
	}
}
