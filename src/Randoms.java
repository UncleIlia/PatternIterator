import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int max;
    protected int min;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                if (random != null) {
                    return true;
                }
                return false;
            }

            @Override
            public Integer next() {
                while (true) {
                    return random.nextInt(max - min + 1) + min;
                }
            }
        };
    }
}

