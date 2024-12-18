import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String type;
    
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){

            HashMap<String,Integer> wear = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            int count=1;

            for(int j = 0;  j < n; j++){
                st = new StringTokenizer(br.readLine());

                st.nextToken();
                type = st.nextToken();

                if(wear.containsKey(type)){
                    wear.put( type, wear.get(type)+1 );
                }
                else{
                    wear.put( type, 1);
                }
            }

            for(int a : wear.values()){
                count = count * (a+1);
            }
            
            System.out.println(count-1); 
        }
    }
}
