package com.h3c.springboot_mysql.pojo;

import lombok.Data;

import java.sql.Date;

@Data
public class Partment {
    private Integer part_id;
    private String part_name;
    private String part_desc;
    private Date create_time;
    public Partment() {
        super();
    }
    public Partment(String part_name, String part_desc) {
        super();
        this.part_name = part_name;
        this.part_desc = part_desc;
    }
}
