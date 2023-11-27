package com.youkenhei.dynamicdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.youkenhei.dynamicdb.pojo.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper extends BaseMapper<Product> {
}
