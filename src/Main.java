import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer>integers = new ArrayList<>();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        for (int i = 0,j=0; i < 10; i++,j++) {
            integers.add(random.nextInt(0,2));
            integerLinkedList.add(random.nextInt(0,2));
        }

        System.out.println("ArrayList before sort : "+integers);
        System.out.println("ArrayList after sort :");
        getSort(integers);
        System.out.println("\n <===================================>");
        System.out.println("LinkedList before sort : " + integerLinkedList);
        System.out.println("LinkedList after sort : ");
        getSort(integerLinkedList);

    }

   public static void getSort(ArrayList<Integer> integers){
        Collections.sort(integers);
       for (Integer integer : integers) {
           System.out.print(" "+integer);
       }
   }
   public static void getSort(LinkedList<Integer>integerLinkedList){
        Collections.sort(integerLinkedList);
       for (Integer integer : integerLinkedList) {
           System.out.print(" "+integer);
       }
   }
}