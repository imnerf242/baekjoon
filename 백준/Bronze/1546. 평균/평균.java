import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int clsnum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        double[] arr = new double[clsnum];
        double max = 0;
        double score = 0 ;
        double avg;

        for (int i=0; i<clsnum; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        max = arr[0];
        for(int i=1; i<clsnum; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        
        for (int i=0; i<clsnum; i++){
            arr[i] = arr[i] / max * 100;
            score += arr[i];
        }

        avg = score / clsnum;
        System.out.println(avg);
    }
}
