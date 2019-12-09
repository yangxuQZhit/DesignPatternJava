package structural.criteria.criteria;

import structural.criteria.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CriteriaFemale
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 16:10
 * @Version 1.0
 **/
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("female")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
