import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr= new int[8];
        int count =0;
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        for(int i =0; i<8; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int k=0; k<7; k++){
            
            if(arr[k] < arr[k+1]){
                count +=1;
            }
            if(arr[k] > arr[k+1]){
                count -=1;
            }
            
        }
        if(count == 7){
            System.out.println("ascending");
        }
        else if(count == -7){
            System.out.println("descending");
        }
        else{
            System.out.println("mixed");
        }
    }
}
