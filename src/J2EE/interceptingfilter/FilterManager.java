package J2EE.interceptingfilter;

import J2EE.interceptingfilter.filter.Filter;

/**
 * @ClassName FilterManager
 * @Description
 * @Author yangxu
 * @Date 2019-12-18 09:37
 **/
public class FilterManager {
    FilterChain chain;

    public FilterManager(Target target) {
        chain = new FilterChain();
        chain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        chain.addFilter(filter);
    }

    public void filterRequest(String request) {
        chain.execute(request);
    }
}
