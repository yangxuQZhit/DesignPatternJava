package behavioral.nullobject;

/**
 * @ClassName NullCustomer
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 10:09
 **/
public class NullCustomer extends AbstractCustomer {
    @Override
    public Boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database.";
    }
}
