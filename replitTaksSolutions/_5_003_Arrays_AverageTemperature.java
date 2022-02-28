//Given an array **temps** with temperature values find and print the average value
//
//
//        Example:
//
//        ```
//        input: 80 88 88 84 82 78 60 68
//
//        output: 78.5
//        ```

import java.util.Scanner;

public class _5_003_Arrays_AverageTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        // Do not touch above. Use array temps
        double total=0.0;

        for(int i=0;i<temps.length;i++)
        {
            total += temps[i];
        }
        System.out.println(total/temps.length);

    }
}
