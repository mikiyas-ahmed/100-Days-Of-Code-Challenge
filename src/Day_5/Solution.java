package Day_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        int result;
        for(int i=1; i<=10;i++){
            result= i*n;
            System.out.println(n+" x "+i+" = "+result);
        }
    }
}