
import java.util.ArrayList;
public class Pairsum2 {
    public static  boolean isPair(ArrayList<Integer>list, int target) {
        int bp = -1;
        int n = list.size();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i+1)) {
                //Breaking point
                bp = i;
                break;
            }
        }


        int lp = bp + 1;
        int rp = bp;
        while (lp != rp) {
            //case1.
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
            return  false;

    }
    public static  void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

       int  target=15;
        System.out.println(isPair(list,target));
    }
}
//class Pairs {
//    public static boolean pairsum(ArrayList<Integer> list, int target) {
//        int bp = -1;
//        int n = list.size();
//
//        for (int i = 0; i < list.size(); i++) {
//            bp = -1;
//            bp = i;
//        }
//        int lp = (lp + 1) % n;
//        int rp = (n + rp - 1) % n;
//        while (lp != rp) {
//            if (list.get(lp) + list.size(rp) = target) {
//                return true;
//            }
//            if (list.get(lp) + list.size(rp) < target) {
//                lp = lp + 1;
//            } else {
//                rp = (n + rp - 1);
//            }
//        }
//        return false;
//    }
//    public static void main(String args[]){
//        ArrayList<Integer>list=new ArrayList<>();
//        list.add(11);
//        list.add(15);
//        list.add(6);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//
//        int  target=15;
//        System.out.println(pairsum(list,target));
//    }
//
//        }