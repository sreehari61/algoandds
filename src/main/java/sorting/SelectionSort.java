package sorting;
import java.util.*;
import java.lang.*;
public class SelectionSort implements ISort{

    String order = "ASC";
    private ArrayList<Integer> data;

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> data) {
        this.data = data;
        for(int i=0; i< data.size();i++){
            for(int j=i+1; j< data.size();j++){
                if(order.equalsIgnoreCase("ASC")){
                    if(data.get(j) < data.get(i)){
                        Util.swap(i,j,data);
                    }
                }else{
                    if(data.get(j) > data.get(i)){
                        Util.swap(i,j,data);
                    }
                }

            }
        }
        return data;
    }

    @Override
    public void printArray() {
        System.out.println(data);
    }

    public void setOrder(String order){
        this.order = order;
    }
}
