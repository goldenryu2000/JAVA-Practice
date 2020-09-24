import java.util.*; //To access ArrayList
public class Unboxing {

    public static void main(String[] args) {

        // Unboxing: the reverse process of autoboxing. The wrapper class object is  converted into it's corresponding primitve DT.

        Character ch = 'a';

        char a = ch;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(24);

        int num = arrayList.get(0);

        System.out.println(num);

    }

}
