package com.ps.patterns;

public class Driver {

	public static void main(String[] args) {


        /*  1*****
            12****
            123***
            1234**
            12345*
            123456    */
		// for(int i= 1;i<=6;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }

        //     for(int k=i+1;k<=6;k++){
        //         System.out.print('*');
        //     }

        //     System.out.println();
        // }


        /*  12345&
            1234&&
            123&&&
            12&&&&
            1&&&&&
            &&&&&&    */
            int input = 6;

        for(int i=1;i<=input;i++){
            for(int j=1;j<=input-i;j++){
                System.out.print(j);
            }

            for(int k=(input-i)+1;k<=6;k++){
                System.out.print('&');
            }

            System.out.println();
        }

        // for(int i = 1; i<=input; i++){
        //     for(int j = 1;j<=i;j++){
        //         if(i > 2 && i< input){
        //             System.out.print(" "); 
        //         }
        //         System.out.print("@"+" ");
        //     }

        //     System.out.println();
        // }

	
	}

}
