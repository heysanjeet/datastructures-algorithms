package data_structures.java_collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListClient {
    public static void main(String[] args) {

        List<String> cityList =new ArrayList<>();
        cityList.add("Patna");
        cityList.add("Bangalore");
        cityList.add("Pune");
        cityList.add("Mumbai");

        cityList.stream().forEach(System.out::println);
    }
}
