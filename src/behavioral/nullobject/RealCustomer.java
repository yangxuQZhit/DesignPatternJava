package behavioral.nullobject;

/**
 * @ClassName RealCustomer
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 10:08
 **/
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public Boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
