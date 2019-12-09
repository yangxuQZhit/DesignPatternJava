package structural.criteria.criteria;

import structural.criteria.Person;

import java.util.List;

/**
 * @ClassName OrCriteria
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 16:22
 * @Version 1.0
 **/
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCirteriaPersons = criteria.meetCriteria(persons);
        List<Person> secondCirteriaPersons = otherCriteria.meetCriteria(persons);
        for (Person person : secondCirteriaPersons) {
            if (!firstCirteriaPersons.contains(person)) {
                firstCirteriaPersons.add(person);
            }
        }
        return firstCirteriaPersons;
    }
}
