import java.util.Iterator;
import java.util.Random;

public class IteratorImpl implements Iterator<Integer> {
    private int min;
    private int max;
    Random random;

    public IteratorImpl(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return random.nextInt(max - min) + min + 1;
    }
}