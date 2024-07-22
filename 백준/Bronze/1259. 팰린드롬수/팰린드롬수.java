import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Boolean TF = false;
        

        while(true){
            
            StringBuilder sb = new StringBuilder(br.readLine());
            
            String str = sb.toString();
            String sb_rv = sb.reverse().toString();
            
            if(str.equals("0")){
                break;
            }

            if(str.equals(sb_rv)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }

            

            
        }
    }
}
