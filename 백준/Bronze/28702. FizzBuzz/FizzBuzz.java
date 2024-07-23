import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int result=0;
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        if(s1.matches("[0-9]+")){
            result = Integer.parseInt(s1)+3;
        }else{
            if(s2.matches("[0-9]+")){
                result = Integer.parseInt(s2)+2;
            }else{
                if(s3.matches("[0-9]+")){
                    result = Integer.parseInt(s3)+1;
                }
            }
        }
        if(result % 3 == 0 ){
            sb.append("Fizz");
        }
        if(result % 5 == 0 ){
            sb.append("Buzz");
        }
        if(sb.length() == 0){
            sb.append(result);
        }

        System.out.println(sb);
    }
}
