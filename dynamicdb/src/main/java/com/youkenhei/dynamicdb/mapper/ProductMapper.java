package com.youkenhei.dynamicdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.youkenhei.dynamicdb.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}
