package HomeWork;
import java.util.Comparator;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args)  {

        int[] array = new int[50];
        Random random = new Random();

        List<Integer> integerArray = new ArrayList();
        List<Integer> integerList = new LinkedList<>();

        for (int i = 0; i < 50; i++) {
            array[i] = random.nextInt(2);
            integerList.add(random.nextInt(2));
            integerArray.add(random.nextInt(2));
            System.out.println(Arrays.toString(array));

            System.out.println("×åéèí " + integerArray);
            Collections.sort(integerArray);
            System.out.println("Êèéèí "+integerArray);


            System.out.println("×åéèí "+integerList);
            Collections.sort(integerList);
            System.out.println("Êèéèí " +integerList);

    }

}


}


