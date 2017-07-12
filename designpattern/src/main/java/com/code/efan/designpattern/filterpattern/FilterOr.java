package com.code.efan.designpattern.filterpattern;

import java.util.List;

/**
 * Created by efan on 2017/5/5.
 * Email: yifanyan@sohu-inc.com
 */

public class FilterOr implements Filter {
    private Filter filter;
    private Filter otherFilter;

    public FilterOr(Filter filter, Filter otherFilter) {
        this.filter = filter;
        this.otherFilter = otherFilter;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> tmpList1 = filter.filter(products);
        List<Product> tmpList2 = otherFilter.filter(products);
        for (Product person : tmpList2) {
            if (!tmpList1.contains(person)) {
                tmpList1.add(person);
            }
        }
        return tmpList1;
    }
}