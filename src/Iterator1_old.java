import java.util.Iterator;

public class Iterator1_old<T> implements Iterator<T> {
    Iterator<T> iter;
    //Iterator<T> temp;
    int k;

    public Iterator1_old(Iterator<T> iter, int k) {
        this.iter = iter;
        this.k = k;
        //this.temp = iter;

    }

    @Override
    public boolean hasNext() {
        return iter.hasNext();
    }
    //@Override
    //public boolean hasNext() {
    //    boolean answer = true;
    //    for (int i = 0; i < k; i++) {
    //        if (temp.hasNext()) {
    //            if (i<k-1) temp.next();
//
    //        }else{
    //            answer=false;
    //            break;
    //        }
    //    }
    //    return answer;
    //}

    @Override
    public T next() {
        for (int i = 0; i < k; i++) {
            if (this.hasNext()) {
                if (i + 1 == k) {
                    return iter.next();
                } else {
                    iter.next();
                }
            }
        }
        return null;
    }
}