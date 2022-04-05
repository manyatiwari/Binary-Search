/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int d = 4;
	    
	    binaryReverse(d);
	}

static void binaryReverse(int d)
{
    int binary[] = new int[50];
    int i =0;
    while(d>0){
        binary[i++]=d%2;
        d=d/2;
    }
    /*int start =0;
    int end = i-1;
    while(start<end){
      int temp = binary[start];
      binary[start] = binary[end];
      binary[end]=temp;
      
      start ++;
      end --;
    }*/
    for(int j =0;j<i;j++){
        System.out.print(binary[j]);
    }
}
}






