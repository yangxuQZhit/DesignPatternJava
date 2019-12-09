package structural.criteria.criteria;

import structural.criteria.Person;

import java.util.List;

/**
 * @ClassName AndCriteria
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 16:20
 * @Version 1.0
 **/
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
