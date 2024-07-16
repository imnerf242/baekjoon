import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine()); 
        int num;
        int prime = 0 ;
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0 ; i < size; i++){
            num = Integer.parseInt(st.nextToken());
            if(isPrime(num)){
                prime++;
            }
            
        }
        System.out.println(prime);

    }
    public static boolean isPrime(int num){
        if (num == 1){
            return false;
        }
        for(int i = 2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
