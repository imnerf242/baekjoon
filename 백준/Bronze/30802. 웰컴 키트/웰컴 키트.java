import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int c =0;

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int[] arr= new int[6];

        for(int i=0; i<6; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st3.nextToken());
        int P = Integer.parseInt(st3.nextToken());

        for(int i=0; i<6; i++){
            
            c += arr[i] / T;

            if(arr[i]%T !=0){
                c++;
            }
        }
        
        sb.append(N/P).append(" ").append(N%P);

        System.out.println(c);
        System.out.println(sb);

    }
}
