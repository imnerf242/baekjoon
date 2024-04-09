import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1,str2 ;
        
        StringTokenizer st1,st2;

        str1 = br.readLine();
        st1 = new StringTokenizer(str1," ");

        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());

        int arr [] = new int[a];

        str2 = br.readLine();
        st2 = new StringTokenizer(str2, " ");
        for (int i=0; i<a; i++){
            
            arr [i] = Integer.parseInt(st2.nextToken());

        }

        for (int k=0; k<a; k++){
            if(arr[k] < b){
                System.out.print(arr[k] + " ");
            }
        }

    }
}
