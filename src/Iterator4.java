import java.util.Iterator;

public class Iterator4 implements Iterator {
    private int previous = 1;
    private int limit;

    public Iterator4(int N) {
        this.limit = N;
    }

    @Override
    public boolean hasNext() {
        return nextPrime() != 0;
    }

    @Override
    public Integer next() {
        if (nextPrime()!=0){
            previous=nextPrime();
            return previous;
        }else {
            return null;
        }
    }

    private int nextPrime() {
        int answer = 0;
        int i = previous + 2;
        for (int j = 3; j < i; j += 2) {
            if (i % j == 0) {
                i+=2;
                j=3;
            }
        }
        if (i<=limit)answer=i;
        //if 0 means there is no next prime:
        return answer;
    }
}
