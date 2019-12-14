package behavioral.Iterator;

import behavioral.Iterator.container.NameRepository;
import behavioral.Iterator.iterator.Iterator;

/**
 * @ClassName IteratorPatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-14 14:50
 **/
public class IteratorPatternDemo {
    public static void main(String[] args){
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator();iterator.hasNext();) {
            String name = (String)iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
