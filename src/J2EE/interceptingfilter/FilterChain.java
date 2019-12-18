package J2EE.interceptingfilter;

import J2EE.interceptingfilter.filter.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FilterChain
 * @Description
 * @Author yangxu
 * @Date 2019-12-18 09:31
 **/
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
