package behavioral.Iterator.container;

import behavioral.Iterator.iterator.Iterator;

/**
 * @ClassName NameRepository
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 14:53
 **/
public class NameRepository implements Container {
    private String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
