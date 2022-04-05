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
	    int d = 6;
	    
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
    int temp=1;
    int decimal=0;
    for(int k=0;k<i;k++){
        decimal = decimal + (binary[k]*temp);
        temp=temp*2;
    }
   // for(int j =0;j<i;j++){
    //    System.out.print(binary[j]);
    //}
    System.out.println(decimal);
}
}






