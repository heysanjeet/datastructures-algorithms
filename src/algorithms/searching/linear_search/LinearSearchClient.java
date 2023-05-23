package algorithms.searching.linear_search;

public class LinearSearchClient {
    public static void main(String[] args) {
        int array[]={5,4,6,8,9,4,3,4,2,0,1,3,45};
        LinearSearch linearSearch=new LinearSearch();
        System.out.println(linearSearch.findPosition(array,6));
    }
}
