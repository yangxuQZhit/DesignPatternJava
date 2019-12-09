package structural.criteria;

import structural.criteria.criteria.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CriteriaPatternDemo
 * @Description TODO
 * @Author huyaohua
 * @Date 2019-12-09 15:53
 * @Version 1.0
 **/
public class CriteriaPatternDemo {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Male: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("Female: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("Single: ");
        printPersons(single.meetCriteria(persons));

        System.out.println("Single Male: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("Single or Female: ");
        printPersons(singleOrFemale.meetCriteria(persons));

    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [Name: " + person.getName() + ", Gender: " + person.getGender() +
                    ", Marital Status: " + person.getMaritalStatus() + "]");
        }
    }
}
