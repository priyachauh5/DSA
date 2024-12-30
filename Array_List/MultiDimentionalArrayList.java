import java.util.ArrayList;
public class MultiDimentionalArrayList{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        mainList.add(arr);
        ArrayList<Integer> main=new ArrayList<>();
        main.add(3);
        main.add(6);
        main.add(9);
        main.add(12);
        main.add(15);
        mainList.add(main);
        ArrayList<Integer> array=new ArrayList<>();
        array.add(4);
        array.add(8);
        array.add(12);
        array.add(16);
        array.add(20);
        mainList.add(array);
        System.out.println(mainList);

        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList=mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }

        ArrayList<ArrayList<Integer>> List=new ArrayList<>();
        ArrayList<Integer> List1=new ArrayList<>();
        ArrayList<Integer> List2=new ArrayList<>();
        ArrayList<Integer> List3=new ArrayList<>();

        for(int i=1; i<=5; i++){
            arr.add(i*1); //1 2 3 4 5
            main.add(i*2); //2 4 6 8 10
            array.add(i*3); //3 6 9 12 15
        }

        List.add(arr);
        List.add(main);
        List.add(array);
        arr.remove(2);

        System.out.println(List);

        //nested loops
        for(int i=0; i<List.size(); i++){
            ArrayList<Integer> currList=List.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}