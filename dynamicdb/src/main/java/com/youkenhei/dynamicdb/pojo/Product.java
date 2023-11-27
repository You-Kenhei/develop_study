package com.youkenhei.dynamicdb.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

@Data
public class Product {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer price;
    @Version
    private Integer version;
    @TableLogic
    private Integer idDelete;
}
