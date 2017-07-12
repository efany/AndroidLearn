package com.code.efan.designpattern.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by efan on 2017/5/5.
 * Email: yifanyan@sohu-inc.com
 */

public class CircleShapeFilter implements Filter {
    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if ("circle".equalsIgnoreCase(product.getShape())) {
                result.add(product);
            }
        }
        return result;
    }
}
