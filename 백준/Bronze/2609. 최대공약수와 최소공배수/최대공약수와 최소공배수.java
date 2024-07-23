import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int temp;
        if(a<b){
            
            temp = a;
            a = b;
            b = temp;
        }
        int gcd = gcd(a,b);
        System.out.println(gcd);
        System.out.println(a*b / gcd);
    }

    public static int gcd(int a,int b){
        if (b == '0'){
            return a;
        }
        while(b!=0){
            int temp = b;
            b = a %b;
            a= temp;
        }
        return a;
    }
}
