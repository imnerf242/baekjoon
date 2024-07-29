import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 1;

        int range = 2;

        if(N==1){
            
        }
        else{
            while(range<=N){
            
                range = range + (count * 6);
                count++;
            }
        }
        System.out.println(count);
    }
}
