package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {

    Map<Character, Integer> frequencyMap = new HashMap<>();

    int applyDiscount(int frequency, int offerCount, int discountedPrice) {
        int itemCount = frequency/
    }

    int getCost() {
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
                int discountCost2 = 200;

                int priceAfterDiscount1 =

                5A for 200
                cost += ((frequencyA / 3) * discountCost) + (frequencyA % 3)*50;
            }
            else if(ch == 'B') {
                int discountCost = 45, frequencyB = Math.max(0, frequencyMap.get(ch) - freeB);
                cost += ((frequencyB / 2) * discountCost) + (frequencyB % 2)*30;
            }
            else return -1;
        }
        return cost;
    }

    public Integer checkout(String skus) {
        for(int i=0; i<skus.length(); i++){
            char ch = skus.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        return getCost();
    }
}
