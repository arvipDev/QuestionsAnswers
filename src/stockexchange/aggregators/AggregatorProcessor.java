package stockexchange.aggregators;

import stockexchange.fileprocessors.StockFileReader;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class AggregatorProcessor<T> {

    private Aggregator agg;
    private String path;


    public AggregatorProcessor(T agg, String s) {
        this.agg = (Aggregator) agg;
        this.path = s;

    }

    public double runAggregator (int column) {
        double value = 0.0;


        try {
            StockFileReader reader = new StockFileReader(path);
            List<String> lines = reader.readFileData();
            for (String line: lines){
                String[] valuesOfLineN = line.split(",");
                Double valueNeeded = Double.valueOf(valuesOfLineN[column-1]);
                agg.add(valueNeeded);
            }
            value = agg.calculate();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return value;
    }
	
}
