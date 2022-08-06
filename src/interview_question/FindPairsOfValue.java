package interview_question;

public class FindPairsOfValue {
    public static void findPairs(char[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.println(array[i]+" "+array[j]);
            }
        }
    }

    public static void main(String[] args) {
        char[] array={'a','b','c','d','e'};
        findPairs(array);
    }
}
