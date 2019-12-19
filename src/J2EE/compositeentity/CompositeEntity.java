package J2EE.compositeentity;

/**
 * @ClassName CompositeEntity
 * @Description
 * @Author yangxu
 * @Date 2019-12-17 17:44
 **/
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String lhs, String rhs) {
        cgo.setData(lhs, rhs);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
