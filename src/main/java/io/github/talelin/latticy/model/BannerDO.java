package io.github.talelin.latticy.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@TableName("banner")
@Getter
@Setter
public class BannerDO {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private String title;

    private String description;

    private String img;

    private Date createTime;

    private Date updateTime;

    private Date deleteTime;
}
