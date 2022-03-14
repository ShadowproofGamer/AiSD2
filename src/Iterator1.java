import java.util.Iterator;

public class Iterator1<T> implements Iterator<T> {
    private Iterator<T> iter;
    private Predicate<Integer> pred;
    private T nextElem=null;
    private boolean nextExist=true;
    private int i=0;

    public Iterator1(Iterator<T> iter, Predicate<Integer> pred) {
        this.iter = iter;
        this.pred = pred;
    }

    private void findNextElem() {
        while (iter.hasNext()) {
            i++;
            nextElem = iter.next();
            if (pred.accept(i)) {
                return;
            }
        }
        nextExist=false;
        nextElem=null;
    }

    @Override
    public boolean hasNext() {
        return nextExist;
    }

    @Override
    public T next() {
        if (nextElem==null){
            findNextElem();
        }
        T answer = nextElem;
        findNextElem();
        return answer;
    }
}
