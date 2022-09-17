package com.ps.problem1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Driver {

	public static void main(String[] args) {
        /* {5,7,2,4,9}
        target : 6 // in the array which index value the sum of target
     output: {2,3} */


	int[] input = {5,7,2,4,9};
    int target = 6;
    ArrayList<Integer> output = new ArrayList<Integer>();
    Map<Integer, Integer> map = new HashMap<>();


    // for(int i=0; i<input.length; i++){
    //     for(int j=i+1;j<input.length;j++){
    //         int sum = input[i] + input[j];
    //         if(sum == target){
    //             output.add(i);
    //             output.add(j);
    //         }
    //     }
    // }

    for(int i=0;i<input.length;i++){
        Integer mapIndex = map.get(input[i]);
        if(mapIndex != null){
            output.add(i);
            output.add(mapIndex);
        }else{
            map.put(target - input[i],i);
        }
    }

    System.out.println(output);
}

}
