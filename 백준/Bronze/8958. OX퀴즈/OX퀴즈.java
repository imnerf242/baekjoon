import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str,OX;
        StringTokenizer st;
        

        str = br.readLine();
        st = new StringTokenizer(str, " ");
        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i<k; i++){

            int[] score = new int[80];
            Arrays.fill(score, 0);

            OX = br.readLine();
            int OXLength = OX.length();
            
                for(int j=0; j<OXLength; j++){
                    if (OX.charAt(j) == 'O'){
                        score[j] = 1;
                        if (j >= 1){
                            if( OX.charAt(j-1) == 'O' && OX.charAt(j) == 'O'){
                                score[j] = score[j-1] + 1 ;
                            }
                        }
                    }
                    else if(OX.charAt(j) == 'X'){
                        score[j] = 0;
                    }
            }

            int sum = Arrays.stream(score).sum();
            System.out.println(sum);

        }


    }
}
