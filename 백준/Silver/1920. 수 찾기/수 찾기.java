import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int arr[];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            if(binarySearch(Integer.parseInt(st.nextToken())) >= 0 ){
                sb.append(1).append("\n");
            }
            else{
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);

    }

    public static int binarySearch(int key){

        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(key < arr[mid]){
                high = mid - 1;
            }

            else if(key > arr[mid]){
                low = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
