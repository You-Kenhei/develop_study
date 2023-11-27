package com.youkenhei.dynamicdatasourse.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youkenhei.dynamicdatasourse.mapper.ProductMapper;
import com.youkenhei.dynamicdatasourse.pojo.Product;
import com.youkenhei.dynamicdatasourse.service.ProductService;
import org.springframework.stereotype.Service;

@Service
@DS("slave_1")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {
}
