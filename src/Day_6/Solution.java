package Day_6;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int numOfString= in.nextInt();
        in.nextInt();
        String [] strings= new String[numOfString];
        for(int i = 0; i<strings.length; i++){
            strings[i]=in.nextLine();
        }
        System.out.println(strings[0]);
        String even,odd ;
        for(int i =0; i<strings.length; i++){
        	even = ""; odd = "";
        	for(int j =0; j<strings[i].length(); j++){
        		if((j+1)%2==0)
        			even=even +strings[i].charAt(j);
        		else
        			odd = odd + strings[i].charAt(j);
            }
        	System.out.println(odd +" "+even);
        }
        
    }
}