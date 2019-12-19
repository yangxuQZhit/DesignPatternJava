package J2EE.compositeentity;

/**
 * @ClassName Client
 * @Description
 * @Author yangxu
 * @Date 2019-12-17 17:46
 **/
public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for (String data : compositeEntity.getData()) {
            System.out.println("Data: " + data);
        }
    }

    public void setData(String lhs, String rhs) {
        compositeEntity.setData(lhs, rhs);
    }
}
