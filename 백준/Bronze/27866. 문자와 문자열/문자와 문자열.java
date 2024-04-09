import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String a = br.readLine();
        
        int count = Integer.parseInt(a)-1;

        char b = str.charAt(count);

        System.out.println(b);
        


    }
}
