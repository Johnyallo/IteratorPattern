package PatternIterator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Randoms implements Iterable<Integer> {
    protected PrimitiveIterator.OfInt random;
    protected int max;
    protected int min;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
        random = new Random().ints(min, max + 1).iterator();
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> iterator = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }
            @Override
            public Integer next() {
                return random.nextInt();
            }
        };
        return iterator;
    }
}
