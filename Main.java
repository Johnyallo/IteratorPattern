package PatternIterator;

import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(90, 100)) {
            System.out.println("Random number " + r);
            if (r == 100) {
                System.out.println("We have got number 100, let's end.");
                break;
            }
        }
    }
}
