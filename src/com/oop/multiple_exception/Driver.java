package com.oop.multiple_exception;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =0,b=0;
        int arr[] = new int[4];
        Scanner in = new Scanner(System.in);

        a = in.nextInt();
        b = in.nextInt();
        
        in.close();

        try{
            System.out.println(a/b);
            for(int i=0;i<4;i++){
                arr[i] = i;
            }
            for(int j:arr){
                System.out.println(arr[j]);
            }
        }catch(ArithmeticException e){
            System.out.println("Cannot devided by 0.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You can have maximum 4 values.");
        }catch(Exception e){
            System.out.println(e);
        }
	}

}
