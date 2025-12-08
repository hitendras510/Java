import java.util.ArrayList;
import java.util.Iterator;

class hello{
    public static void main(String[] args){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        Iterator<Integer> it = List.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            //to remove
            if(it.next() == 5){
                it.remove();
            }
        }
    }
}