package software.ulpgc;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RegisterLoader loader = new CSVFileRegisterLoader(new File("CPU_benchmark_v4.csv"));
        List<Register> registers = loader.load();
        Map<Integer, Integer> ColumnChart = new CoresRegisterProcesor().process(registers);
        for (int key: ColumnChart.keySet().stream().sorted().toList()){
            System.out.println(key + " : " + ColumnChart.get(key));
        }
    }
}
