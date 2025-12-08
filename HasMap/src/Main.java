////Sorting
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
////class hello{
//// public  static void main(String[] args){
////     ArrayList<Integer> list=new ArrayList<>();
////     list.add(1);
////     list.add(2);
////     System.out.println(list);
////     Collections.sort(list);
////     System.out.println(list);
//// }
////}
////
//
//class Student implements Comparable<Student> {
//int RollNo;
//String name;
//public Student(int RollNo, String name){
//    this.RollNo=RollNo;
//    this.name=name;
//}
//public int compareTo(Student o) {
//    return this.RollNo-o.RollNo;
//}
//public String toString(){
//    return "Student RollNo: "+RollNo+", Name: "+name;
//}
//}
//class NameSorted implements Comparator<Student> {
//    public int compare(Student o1, Student o2) {
//        return o1.name.compareTo(o2.name);
//    }
//}
//
//class hello{
//    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<>();
//        list.add(new Student(139,"Hitendra"));
//        list.add(new Student(216, "Om" ));
//        list.add(new Student(23, "Krishna"));
//        list.add(new Student(24, "Anish"));
//        Collections.sort(list, new NameSorted());
//        for(Student s: list){
//            System.out.println(s);
//        }
//    }
//}


