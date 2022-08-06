package data_structures.arrays;

public class ArraysImplTest {
    public static void main(String[] args) {
        ArraysImpl arrays=new ArraysImpl();
        arrays.push("Sanjeet");
        arrays.push("Kumar");
        arrays.push("Sanjeet");
        arrays.push("Kumar");
        arrays.printArray();
        System.out.println("-----------------------------------");
        System.out.println(arrays.get(1));
        System.out.println(arrays.size());
        System.out.println(arrays.delete(0));
        System.out.println(arrays.size());
    }
}
