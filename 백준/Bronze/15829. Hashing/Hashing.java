import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long sum = 0;
        long hash = 0;
        String str = br.readLine();
        int pow=1;

        for(int i = 0; i<N; i++){
            sum += ((int)str.charAt(i) - 96) * pow;
            pow = (pow * 31) % 1234567891;
        }

        hash = sum % 1234567891;

        System.out.println(hash);
    }
}
