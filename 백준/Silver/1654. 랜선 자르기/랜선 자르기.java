import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];


        for(int i =0; i < K; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);

        long leng = length(arr,N);

        System.out.println(leng);
    }

    public static long length(int arr[],int N){

        long start = 1;
        long end = arr[arr.length -1];
        long leng = 0;     
            
            while(start <= end){
                long count = 0;
                long mid = (start + end) / 2;

                for(int i = 0; i < arr.length; i++){
                    count += arr[i] / mid;
                }

                if(count < N){
                    end = mid -1 ;
                }
                else{
                    start = mid + 1;
                }
                leng = end;
            }
            return leng;
    }
}

