import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A,B,C,ABC;

        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());

        ABC = A * B * C;
        String abc = String.valueOf(ABC);


        
        
        for(int j = 0; j < 10; j++){

            int count = 0;

            for(int i=0; i<abc.length(); i++){

                if((abc.charAt(i) -'0') == j){
                    count++; 
                }
            }
            System.out.println(count);
            
            
        }
        
    }
}
