import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

    

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[end+1];
        StringBuilder sb = new StringBuilder();

        arr[0] = arr[1] = true;
        
        for(int i = 2; i*i <=end; i++){
            if(!arr[i]){
                for(int j = i*i; j<=end; j+=i){
                    arr[j] = true;
                }
            }
        }
        
        for(int i = start; i<=end; i++){
            if(!arr[i]){
                sb.append(i).append("\n");
                
            }      
        }
        System.out.println(sb);
    }
}


