import java.util.ArrayList;
import java.util.Collections;

//public class Assign {
//    public static boolean Assignmono( ArrayList<Integer>A) {
//        boolean inc = true;
//        boolean dec = false;
//        for (int i = 0; i < A.size()-1; i++) {
//            if (A.get(i) >= A.get(i + 1)) {
//                inc = false;
//            }
//            if(A.get(i) < A.get(i+1)){
//                dec=false;
//            }
//        }
//        return  inc || dec;
//    }
//    public static void main(String args[]) {
//
//        ArrayList<Integer> A= new ArrayList<>();
//        A.add(6);
//        A.add(6);
//        A.add(8);
//        A.add(9);
//
//        System.out.println(Assignmono(A));
//    }
//}
 public class Assign{
     public ArrayList<Integer> Findlonely(ArrayList<Integer>nums){
         ArrayList<Integer>list=new ArrayList<>();

         Collections .sort(nums);
         for (int i=1;i< nums.size()-1;i++){
             if(nums.get(i+1) +1 < nums.get(i) && nums.get(i)+1< nums.get(i+1)){
               list.add(nums.get(i));
             }
             if(nums.size()==1){
                 list.add(nums.get(0));
             }
             if(nums.size() > 1){
                 list.add(nums.get(0));
             }
             if (nums.get(i)-2 + 1 < nums.get(nums.size()-1)){
                 list.add(nums.get(nums.size()-1));
         }

     }
         return list;

}


    public static  void  main(String args[]){
        ArrayList<Integer>num=new ArrayList<>();
        num.add(10);
        num.add(6);
        num.add(5);
        num.add(8);
        Collections.sort(num);
        System.out.println(num);
    }
}