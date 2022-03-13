import java.util.Iterator;

public class Iterator3<T> implements Iterator<T> {
    Iterator<T> iter1;
    Iterator<T> iter2;
    Iterator<T> previous;

    public Iterator3(Iterator<T> iter1, Iterator<T> iter2){
        this.iter1=iter1;
        this.iter2=iter2;
        previous=iter2;
    }

    @Override
    public boolean hasNext() {
        return iter1.hasNext() || iter2.hasNext();
    }

    @Override
    public T next() {
        if (previous == iter2 && iter1.hasNext()){
            previous = iter1;
            return iter1.next();
        }else if (previous == iter1 && iter2.hasNext()){
            previous = iter2;
            return iter2.next();
        }else if (hasNext()){
            return previous.next();
        }else{
            return null;
        }

    }
}
