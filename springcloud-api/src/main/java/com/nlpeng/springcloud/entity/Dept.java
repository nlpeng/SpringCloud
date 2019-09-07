package com.nlpeng.springcloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author Ferry NLP
 * @create 2019-09-06
 * @see
 * @since 1.0v
 **/
@SuppressWarnings("serial")//忽略警告
@NoArgsConstructor//无参构造器
//@AllArgsConstructor//全参构造器
@Data//getter/setter方法
@Accessors(chain=true)//链式风格访问
public class Dept implements Serializable{ // entity --orm--- db_table



    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }


}