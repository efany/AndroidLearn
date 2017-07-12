package com.code.efan.designpattern.filterpattern;

import java.util.List;

/**
 * Created by efan on 2017/5/5.
 * Email: yifanyan@sohu-inc.com
 */

public interface Filter {
    List<Product> filter(List<Product> products);
}
