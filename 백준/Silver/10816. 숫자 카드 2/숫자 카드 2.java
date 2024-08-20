import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static int count;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            int key = Integer.parseInt(st.nextToken());

            sb.append(upperbound(key)- lowerbound(key)).append(' ');
        }
        System.out.println(sb);
    }

    public static int lowerbound(int key){
        
        int low = 0;
        int high = arr.length ;

        while(low < high){
            int mid = (low + high) / 2;

            if(key <= arr[mid]){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }

        return low;
    }

    public static int upperbound(int key){
        
        int low = 0;
        int high = arr.length ;

        while(low < high){
            int mid = (low + high) / 2;

            if(key < arr[mid]){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }

        return low;
    }

}
