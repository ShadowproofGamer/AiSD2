import java.util.Iterator;

public class Iterator4 implements Iterator {
    private int previous = 1;
    private int current = 1;
    private int limit;

    public Iterator4(int N) {
        this.limit = N;
    }

    @Override
    public boolean hasNext() {
        if (previous < limit) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        return null;
    }

    private int nextPrime() {
        int answer = 0;
        int i = previous + 2;
        while(i<=limit && answer==0){
            for (int j = 3; j < i; j += 2) {
                if (i % j == 0) {
                    break;
                }
            }
        }
        return answer;
    }
}
