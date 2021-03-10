package programers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PullTwoAndAdd {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        
        int size = numbers.length;
        for (int i=0; i<size; i++) {
            for (int j=i+1; j<size; j++) {
                int newVal = numbers[i] + numbers[j];
                if (!list.contains(newVal)) {
                    list.add(numbers[i]+numbers[j]);
                }
            }
        }

        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {

        PullTwoAndAdd object = new PullTwoAndAdd();
        
        int[] numbers = {5,0,2,7};

        int[] result = object.solution(numbers);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
