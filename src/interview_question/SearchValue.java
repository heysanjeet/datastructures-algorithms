package interview_question;

public class SearchValue {

    public static int searchvalue(String array[]){
        for(int i=0;i<array.length;i++){
            if(array[i]=="Sanjeet"){
                System.out.println("Found value");
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] array={"Sanjeet"};
        System.out.println(searchvalue(array));
    }
}
