import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String count = br.readLine();
        StringTokenizer stc = new StringTokenizer(count);

        int k = Integer.parseInt(stc.nextToken());

        for(int i =0; i<k; i++){
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a+b);
        }
    }
}
