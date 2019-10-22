package service;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIt implements Iterator<Integer> {

    private final int[] numbers;
    private int index = 0;

    public EvenIt(final int[] numbers) {
        this.numbers = numbers;
    }

    public boolean hasNext() {
        boolean isEven = false;
        for (int i = index; i < numbers.length; i++) {
            if ((numbers[i] % 2) == 0) {
                isEven = true;
                break;
            }
        }
        return isEven;
    }

    public Integer next() {
        Integer element = null;
        while (numbers.length > index) {
            if ((numbers[index] % 2) == 0) {
                element = numbers[index];
                index++;
                return element;
            } else {
                index++;
            }
        }
        throw new NoSuchElementException();
    }

    public void remove() throws UnsupportedOperationException {
    }
}
