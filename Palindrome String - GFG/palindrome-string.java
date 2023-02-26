//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        char s[]=S.toCharArray();
        int i=0;
        int j=s.length-1;
        int ans=1;
        while(i<=j){
            if(s[i]==s[j]){
                i++;
                j--;
            }else{
                ans=0;
                return ans;
            }
        }
        return ans;
    }
};