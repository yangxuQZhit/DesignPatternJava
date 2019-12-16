package J2EE.businessdelegate;

import J2EE.businessdelegate.businessservice.BusinessLookup;
import J2EE.businessdelegate.businessservice.BusinessService;

/**
 * @ClassName BusinessDelegate
 * @Description
 * @Author yangxu
 * @Date 2019-12-16 17:28
 **/
public class BusinessDelegate {
    private BusinessLookup lookup = new BusinessLookup();
    private BusinessService service;
    private String serviceType;

    public void setServiceType(String type) {
        this.serviceType = type;
    }

    public void doTask() {
        service = lookup.getBusinessService(serviceType);
        service.doProcessing();
    }
}
