package com.youkenhei.dynamicdb.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youkenhei.dynamicdb.mapper.ProductMapper;
import com.youkenhei.dynamicdb.pojo.Product;
import com.youkenhei.dynamicdb.service.ProductService;
import org.springframework.stereotype.Service;

@DS("slave_1")
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
