package structural.criteria.criteria;

import structural.criteria.Person;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
