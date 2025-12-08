import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//iterator sirf forward travel krta hai
//class Main{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//
//        Iterator<Integer> it = list.iterator();
//
//        while(it.hasNext()){
//            int value = it.next();   // only one next() call
//            System.out.println(value);
//
//            if(value == 5){
//                it.remove();         // safe removal
//            }
//        }
//        System.out.println("After removal: " + list);
//    }
//}


//iterator list forward or backward move krskta hai h
ListIterator<Integer> listIterator = list.listIterator();
while(listIterator.hasPrevious()){
    int val =  listIterator.previous();
    System.out.println(val);

    if(val == 5) {
        listIterator.remove();
    }
}
System.out.println(list);
    }