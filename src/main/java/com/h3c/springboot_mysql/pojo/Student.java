package com.h3c.springboot_mysql.pojo;

import com.h3c.springboot_mysql.enums.StuSexEnums;
import lombok.Data;

@Data
public class Student {
    private Integer stu_id;
    private String stu_name;
    private String stu_addr;
    private StuSexEnums stu_sex;

    public Student() {
        super();
    }
    public Student(String stu_name, String stu_addr, StuSexEnums stu_sex) {
        super();
        this.stu_name = stu_name;
        this.stu_addr = stu_addr;
        this.stu_sex = stu_sex;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "stu_name " + this.stu_name + ", stu_addr " + this.stu_addr + "stu_sex " + stu_sex.name();
    }

}
