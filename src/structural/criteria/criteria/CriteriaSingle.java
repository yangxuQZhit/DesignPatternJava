package structural.criteria.criteria;

import structural.criteria.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CriteriaSingle
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 16:18
 * @Version 1.0
 **/
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("single")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
