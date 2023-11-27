package com.youkenhei.dynamicdb.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("t_user")
public class User {
    @TableId(value = "uid", type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableLogic
    private Integer idDelete;
    private Integer sex;
    @Version
    private Integer version;
}
