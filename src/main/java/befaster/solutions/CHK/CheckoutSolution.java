package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for(int i=0; i<skus.length(); i++){
            char ch = skus.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        int cost = 0;

        int frequencyE = frequencyMap.getOrDefault('E', 0);
        int freeB = frequencyE / 2;

        for(char ch: frequencyMap.keySet()) {
            if(ch == 'D') {
                cost += frequencyMap.get(ch) * 15;
            }
            else if(ch == 'C') {
                cost += frequencyMap.get(ch) * 20;
            }
            else if(ch == 'E') {
                cost += frequencyMap.get(ch) * 40;
            }
            else if(ch == 'A') {
                int discountCost = 130, frequencyA = frequencyMap.get(ch);
                int discount2 = 200;

                int priceAfterDiscount1 = (frequencyA / 5) * discount2;
                cost += priceAfterDiscount1;
                frequencyA = frequencyA % 5;

                int priceAfterDiscount2 = (frequencyA / 3) * discountCost;
                cost += priceAfterDiscount2;
                frequencyA = frequencyA % 3;

                cost += (frequencyA*50);
            }
            else if(ch == 'B') {
                int discountCost = 45, frequencyB = Math.max(0, frequencyMap.get(ch) - freeB);
                cost += ((frequencyB / 2) * discountCost) + (frequencyB % 2)*30;
            }
            else return -1;
        }
        return cost;
    }
}


