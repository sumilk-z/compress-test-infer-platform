package com.kerbalogy.ctip.auth.vanilla.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author yaozongqing@outlook.com
 * @date 2023/7/10 22:04
 * @description
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user_auth")
public class UserAuth {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userInfoId;

    private String username;

    private String password;

    private Integer loginType;

    private String ipAddress;

    private String ipSource;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    private Date lastLoginTime;

}
