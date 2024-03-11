import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    int n = arr.size();
    double countP = 0;
    double countN = 0;
    double countZ = 0;

    for (int i = 0; i < n; i++) {
        int value = arr.get(i);
        if (value < 0) {
            countN++;
        } else if (value > 0) {
            countP++;
        } else {
            countZ++;
        }
    }

    System.out.println(countP / n);  // Print proportion of positive values
    System.out.println(countN / n);  // Print proportion of negative values
    System.out.println(countZ / n);  // Print proportion of zero values
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
