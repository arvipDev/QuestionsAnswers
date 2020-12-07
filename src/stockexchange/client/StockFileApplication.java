package stockexchange.client;

import java.io.IOException;
import java.util.*;

import stockexchange.fileprocessors.StockFileData;
import stockexchange.fileprocessors.StockFileReader;

public class StockFileApplication {
	
	public static void main(String args[]) throws IOException{
		StockFileReader fr = new StockFileReader("table.csv");
		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
		StockFileData fileData = new StockFileData();
		fileData.addData(dataResult);
		fileData.printData();

	}
	/**
	 * Complete the method body so that it returns the given structure needed to 
	 * populate the data field in the StockFileData class. 
	 * @param headers
	 * @param lines
	 * @return List
	 */
	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
		List<HashMap<String, Double>> dataResult = new ArrayList<>();
		// Insert your code here..
		for (String line : lines) {
			String[] values = line.split(",");
			List<String> temp;
			LinkedHashMap<String, Double> element = new LinkedHashMap<>();
			for (int j = 0; j < 6; j++) {
				temp = Arrays.asList(values);
				element.put(headers.get(j), Double.valueOf(temp.get(j)));
			}
			dataResult.add(element);
		}
		return dataResult;
	}
	
	
}
