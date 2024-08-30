import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int a = (int) Math.round(n * 0.15);
        int sum = 0;
        double average;


        for(int i = 0; i < n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int i = a; i < n-a; i ++){
            list2.add(list.get(i));
        }
        
        for(int i =0; i<list2.size(); i++){
            sum += list2.get(i);
        }

        average = (double) sum / (n- a * 2);

        System.out.println((int) Math.round(average));

    }
}
