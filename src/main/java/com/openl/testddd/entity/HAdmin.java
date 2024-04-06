package com.openl.testddd.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("h_admin")
public class HAdmin {
  @TableId
  private long id;
  private long adminRole;
  private String adminName;
  private String adminPassword;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getAdminRole() {
    return adminRole;
  }

  public void setAdminRole(long adminRole) {
    this.adminRole = adminRole;
  }


  public String getAdminName() {
    return adminName;
  }

  public void setAdminName(String adminName) {
    this.adminName = adminName;
  }


  public String getAdminPassword() {
    return adminPassword;
  }

  public void setAdminPassword(String adminPassword) {
    this.adminPassword = adminPassword;
  }

}
