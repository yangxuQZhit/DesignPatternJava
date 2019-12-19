package J2EE.compositeentity;

/**
 * @ClassName CoarseGrainedObject
 * @Description
 * @Author yangxu
 * @Date 2019-12-17 17:40
 **/
public class CoarseGrainedObject {
    private DependentObject1 object1 = new DependentObject1();
    private DependentObject2 object2 = new DependentObject2();

    public void setData(String lhs, String rhs) {
        object1.setData(lhs);
        object2.setData(rhs);
    }

    public String[] getData() {
        return new String[]{object1.getData(), object2.getData()};
    }
}
