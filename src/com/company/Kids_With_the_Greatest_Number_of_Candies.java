package com.company;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int[] candies = {1, 2, 3, 4, 5, 6};
        List<Boolean> checkCandies = new ArrayList<>();
        int extraCandies = 3;
        int highestCandies = 0;
        for (int i = 0; i < candies.length; i++) {
            if (highestCandies < candies[i]) {
                highestCandies = candies[i];
            }
            candies[i] += extraCandies;
        }
        System.out.println("Highest Candies is : " + highestCandies);

        for(int i = 0; i < candies.length; i++) {
            if (candies[i] > highestCandies) {
                checkCandies.add(true);
            } else {
                checkCandies.add(false);
            }
        }
        for(int i=0;i<checkCandies.size();i++){
            System.out.println(checkCandies.get(i)+" ");
        }

    }
}
