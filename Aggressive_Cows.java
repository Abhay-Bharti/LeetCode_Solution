//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.aggressiveCows(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        int res = 0;
        
        Arrays.sort(stalls);
        int s = 1, e = stalls[stalls.length-1]-stalls[0];
        
        while(s<=e){
            int mid = s + (e-s)/2;
            
            if(valid(stalls, k, mid)){
                res = mid;
                s = mid+1;
            }else{
                e = mid-1;
            }
            
        }
        return res;
    }
    
    static boolean valid(int[] nums, int k, int dist){
        int cnt = 1,prev = nums[0];
        
        for(int i = 1; i<nums.length; i++ ){
            if(nums[i] - prev >= dist ){
                cnt++;
                prev = nums[i];
            }
        }
        return cnt>=k;
    }
}