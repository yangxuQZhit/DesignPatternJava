package behavioral.nullobject;

/**
 * @ClassName CustomerFactory
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 10:11
 **/
public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer createCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
