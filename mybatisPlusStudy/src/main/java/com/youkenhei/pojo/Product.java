package com.youkenhei.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

@Data
@TableName("t_product")
public class Product {
    private Long id;
    private String name;
    private Integer price;

    @Version  // 标识乐观锁版本号字段
    private Integer version;
}
