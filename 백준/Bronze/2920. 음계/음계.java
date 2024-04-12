import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr= new int[8];
        int[] asd = {1,2,3,4,5,6,7,8};
        int[] dsd = {8,7,6,5,4,3,2,1};

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        for(int i =0; i<8; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if(Arrays.equals(arr, asd)){
            System.out.println("ascending");
        }
        else if(Arrays.equals(arr, dsd)){
            System.out.println("descending");
        }
        else {
            System.out.println("mixed");
        }
    }
}
