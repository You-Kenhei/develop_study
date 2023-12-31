package com.youkenhei.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.youkenhei.enums.SexEnum;
import lombok.Data;

@Data
@TableName("t_user")
public class User {
    @TableId(value = "uid", type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private SexEnum sex;
    @TableLogic
    private Integer isDelete;
    @Version
    private Integer version;
}
