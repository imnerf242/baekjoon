import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int num = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        int sum =0;
        int max =0;

        int[] score= new int[num];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            score[i] = Integer.parseInt(st2.nextToken());
        }

        for(int i=0; i<num;i++){
            for(int j=i+1; j<num; j++){
                for(int k=j+1; k<num; k++){

                    sum = score[i] + score[j] +score[k];
                    
                    if(sum <= total){

                        if(sum > max){
                            max = sum;   
                        }
                    }
                }
            }
        }

        System.out.println(max);



    }
}
