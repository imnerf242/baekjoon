import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;

        str = br.readLine();
        st = new StringTokenizer(str, " ");

        int score = Integer.parseInt(st.nextToken());

        if(score >=90 && score<=100 ){
            System.out.println("A");
        } 
        else if(score >=80 && score<90) {
            System.out.println("B");
        }
        else if(score >=70 && score<80) {
            System.out.println("C");
        }
        else if(score >=60 && score<70) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }
        
    }
}
