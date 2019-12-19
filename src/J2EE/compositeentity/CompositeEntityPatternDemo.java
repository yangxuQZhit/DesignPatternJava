package J2EE.compositeentity;

/**
 * @ClassName CompositeEntityPatternDemo
 * @Description
 * @Author yangxu
 * @Date 2019-12-17 17:38
 **/
public class CompositeEntityPatternDemo {
    public static void main(String[] args){
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
