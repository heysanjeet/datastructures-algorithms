package algoexpert.arrays.medium;

public class MajorityElement {
    public static void main(String[] args) {
       //intput=[1,2,3,2,2,1,2] oputput=2
    }


    public int majorityElement(int[] array) {
        int count = 0;
        int answer = array[0];
        for (int value : array) {
            if (count == 0) {
                answer = value;
            }
            if (value == answer) {
                count++;
            } else {
                count--;
            }
        }
        return answer;
    }

}
