package behavioral.nullobject;

/**
 * @ClassName NullObjectPatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 10:05
 **/
public class NullObjectPatternDemo {
    public static void main(String[] args){
        AbstractCustomer customer1 = CustomerFactory.createCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.createCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.createCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.createCustomer("Laura");

        System.out.println("Customers:");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
