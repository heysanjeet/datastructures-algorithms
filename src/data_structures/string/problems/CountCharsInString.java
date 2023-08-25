package data_structures.string.problems;

public class CountCharsInString {

    //print all the chars, and it's frequency in sorted order
    public static void main(String[] args) {
        String str="sanjeetkumar";
        int[] count=new int[26];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;//get the ascii value of s lets say
        }for(int i=0;i<26;i++){
            if(count[i]>0){
                System.out.println((char)(i+'a')+" "+count[i]);//add ascii value to all char and print the count
            }
        }
    }
}
