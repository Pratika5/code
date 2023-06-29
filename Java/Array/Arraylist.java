import  java.util.ArrayList;
public class Arraylist {
    public static  void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
       // System.out.println(list);
        //get operation
//        int Element= list.get(3);
//        System.out.println(Element);

        //Delete /remove
//        list.remove(2);
//        System.out.println(list);
        //Set operation.
     //  list.set(1,6);
//        System.out.println(list);
        //contain element.
        System.out.println(list.contains(1));//1 is contain num=true.
        System.out.println(list.contains(6));//6 is not contain no=false.
        System.out.println(list.contains(12));//12 is not contain no=false.
        System.out.println(list.contains(4));

    }
}
