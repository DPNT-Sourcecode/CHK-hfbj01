package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {

    public Integer[] applyDiscount(int originalFrequency, int offerFrequency, int offerPrice) {
        int result = 0;
        result += (originalFrequency / offerFrequency) * offerPrice;
        originalFrequency %= offerFrequency;
        return new Integer[] {result, originalFrequency};
    }
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
                int frequencyA = frequencyMap.get(ch);

                Integer[] response_d1 = applyDiscount(frequencyA, 5, 200);
                cost += response_d1[0];
                frequencyA = response_d1[1];

                Integer[] response_d2 = applyDiscount(frequencyA, 3, 130);
                cost += response_d2[0];
                frequencyA = response_d2[1];

                cost += (frequencyA*50);
            }
            else if(ch == 'F') {
                int frequencyF = frequencyMap.get(ch);
                int leftF = frequencyF % 3;
                int fGroups = frequencyF / 3;

                cost += (fGroups * 20) + (leftF * 10);
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

