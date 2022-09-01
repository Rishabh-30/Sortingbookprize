import java.util.ArrayList;
import java.util.List;

public class Practise {
    public static void main(String[] args) {
        List<Integer> interlist = new ArrayList<>();

        interlist.add(10);
        interlist.add(20);
        interlist.add(30);
        interlist.add(33);
        interlist.add(50);
        interlist.add(75);
        interlist.add(70);
        interlist.add(80);
        interlist.add(85);
        interlist.add(10);

        int countEven = 0;
        int countOdd = 0;
        for (Integer elementOfArray : interlist){
            if(elementOfArray % 2 == 0){
                countEven++;

            }
            else {
                countOdd++;

            }
        }
        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);



    }
}

