package com.youkenhei.dynamicdatasourse.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class User {
    @TableId("uid")
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Integer isDelete;
    private Integer sex;
    private Integer version;
}
