import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    private final int min, max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IteratorImpl(min, max);
    }

}