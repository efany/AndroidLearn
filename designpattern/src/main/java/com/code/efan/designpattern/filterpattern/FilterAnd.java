package com.code.efan.designpattern.filterpattern;

import java.util.List;

/**
 * Created by efan on 2017/5/5.
 * Email: yifanyan@sohu-inc.com
 */

public class FilterAnd implements Filter {
    private Filter filter;
    private Filter otherFilter;

    public FilterAnd(Filter filter, Filter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> tmpList = filter.filter(products);
        return otherFilter.filter(tmpList);
    }
}
