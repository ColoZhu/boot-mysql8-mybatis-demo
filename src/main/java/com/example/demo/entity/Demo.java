package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * demo
 * @author 
 */
@Data
public class Demo implements Serializable {
    private Integer id;
    private String name;
    private Date createTimestamp;
    private Date createDate;
    private Date createDatetime;
    private Object year;
    private Date time;

    private static final long serialVersionUID = 1L;
}