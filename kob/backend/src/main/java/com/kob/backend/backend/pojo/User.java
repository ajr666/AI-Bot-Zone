package com.kob.backend.backend.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor//无参构造函数
@AllArgsConstructor//有参...
public class User {//将表user翻译成class
    @TableId(type= IdType.AUTO)//id自增
    private Integer id;
    private String username;
    private String password;
    private String photo;
}
