import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int intnum = A + B -C;

        String ab = "";
        ab += A;
        ab += B;
        int int_ab = Integer.parseInt(ab);
        int strnum = int_ab - C;
        System.out.println(intnum);
        System.out.println(strnum);

    }
}
