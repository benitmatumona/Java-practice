import java.util.List;
import java.util.ArrayList;


public class App {
    public static List<Integer> peakFinder(List<Integer> myTemp) {
        int currentTemp, prevTemp, nextTemp;

        List<Integer> peakTemps = new ArrayList<>();

        for (int idx = 1; idx < myTemp.size() - 1; idx++) {
            currentTemp = myTemp.get(idx);
            prevTemp = myTemp.get(idx - 1);
            nextTemp = myTemp.get(idx + 1);

            if (currentTemp > prevTemp && currentTemp > nextTemp) {
                peakTemps.add(currentTemp);
            }
        }
        return peakTemps;
    } 

   
    public static void main(String[] args) throws Exception {
        int[] myTemp = {1, 4, 3, 5, 2};
        List<Integer> temp = convertToArrayList(myTemp);
        List<Integer> results = peakFinder(temp);
        
        System.out.println(results);

    }

    public static List<Integer> convertToArrayList(int[] numbers) {
        List<Integer> temps = new ArrayList<>();

        //Apply Autoboxing
        for (int temp : numbers) {
            temps.add(temp);
        }

        return temps;
    }
}
