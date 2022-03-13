import java.util.Iterator;

public class Iterator2 implements Iterator {
    private int current = 1;
    private int previous = 1;
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int answer = current+previous;
        previous=current;
        current = answer;
        return answer;
    }
}
