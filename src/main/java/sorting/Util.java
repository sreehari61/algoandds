package sorting;

import java.util.ArrayList;

public class Util {
    public static void swap(Integer index1, Integer index2, ArrayList<Integer> data){
        Integer temp = data.get(index1);
        data.set(index1,data.get(index2));
        data.set(index2,temp);
    }
}
