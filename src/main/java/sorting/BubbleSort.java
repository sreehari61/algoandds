package sorting;

import java.util.ArrayList;

public class BubbleSort implements ISort{

    String order = "ASC";
    private ArrayList<Integer> data;

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> data) {
        this.data = data;
        for(int i=data.size()-1; i>=1 ;i--){
            for(int j=0; j< data.size()-2;j++){
                if(data.get(j) > data.get(j+1)){
                    Util.swap(j,j+1,data);
                }
            }
        }
        return data;
    }

    @Override
    public void printArray() {
        System.out.println(data);
    }


}
