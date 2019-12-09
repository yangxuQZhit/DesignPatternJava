package structural.criteria.criteria;

import structural.criteria.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CriteriaMale
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 16:12
 * @Version 1.0
 **/
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("male")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
