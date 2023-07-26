package TCS_Code_vita;
import java.util.*;
import java.lang.*;
import java.io.*;

    /* Name of the class has to be "Main" only if the class is public. */
    class wae_ques1
    {
        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t > 0){
                int n= sc.nextInt();
                int k= sc.nextInt();
                boolean check = true;
                int arr[] = new int[n+1];
                for(int i=1;i<n-1;i++){
                    check = true;
                    if((i-k)>=1 && arr[i-k]==0){
                        arr[i-k] = i;
                    }
                    else if((i+k)<=n && arr[i+k]==0){
                        arr[i+k] = i;
                    }
                    else{
                        check = false;
                        break;
                    }
                }
                if(check == false){
                    System.out.println("CAPTAIN AMERICA EVADES");
                }
                else{
                    for(int i=1;i<n-1;i++){
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println("");
                }
                t--;
            }
        }
    }

