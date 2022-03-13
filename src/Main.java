import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        zad2();





    }
    private static void zad1(){
        //zad1
        ArrayList<Integer> tab = new ArrayList<>();
        for (int i=1; i<1000;i++){
            tab.add(i);
        }
        Iterator1<Integer> itr = new Iterator1<>(tab.iterator(), 5);
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    private static void zad2(){
        //zad2
        Iterator2 iterator2 = new Iterator2();
        int count2 = 20;
        while (iterator2.hasNext() && count2>0){
            System.out.println(iterator2.next());
            count2--;
        }
    }
    private static void zad3(){
        //zad3
        ArrayList<Integer> tab2 = new ArrayList<>();
        for (int i=1; i<100;i++) {
            tab2.add(i);
        }
        ArrayList<Integer> tab3 = new ArrayList<>();
        for (int i=10; i<100;i++) {
            tab3.add(i);
        }
        Iterator3<Integer> iterator3 = new Iterator3<>(tab2.iterator(), tab3.iterator());
        while (iterator3.hasNext()){
            System.out.println(iterator3.next());
        }
    }
    //iteratory jako pętla for:

}
