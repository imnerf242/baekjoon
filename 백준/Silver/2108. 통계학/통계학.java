import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        double sum = 0;
        int mid = 0;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());;
        }

        //산술 평균     
        for(int i = 0; i < N; i++){
            sum += arr[i];
        }
        

        //중앙값
        Arrays.sort(arr);

        mid = arr[(N / 2) ];

        //최빈값

        int count = 1;
        int maxcount = 1;

        List<Integer> list = new ArrayList<>();
        int max;
        list.add(arr[0]);

        for(int i = 1; i < N; i++){
            if(arr[i-1] == arr[i]){
                count++;
            }
            else{
                count = 1;
            }

            if(count == maxcount){
                if(list.indexOf(arr[i]) == -1){
                    list.add(arr[i]);
                }
            }
            else if(count > maxcount){
                list.clear();
                maxcount = count;

                list.add(arr[i]);
            }
            
        }

        Collections.sort(list);

        if(list.size() >= 2){
            max = list.get(1);
        }
        else{
            max = list.get(0);  
        }


        //범위

        int range = 0;

        range = arr[N-1] - arr[0];

        //출력
        System.out.println(Math.round(sum / N));
        System.out.println(mid);
        System.out.println(max);
        System.out.println(range);

    }


}
