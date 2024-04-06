package com.openl.testddd.entity;


import com.baomidou.mybatisplus.annotation.TableName;

@TableName("h_user")
public class HUser {

  private long id;
  private String wxminiUnionid;
  private long groups;
  private String wxminiOpenid;
  private double balance;
  private long level;
  private String alipay;
  private String alipayName;
  private String weixin;
  private String phone;
  private String realname;
  private String idcard;
  private long regTime;
  private long loginCount;
  private long loginTime;
  private long status;
  private long statusTime;
  private long isAuth;
  private long isWithdrawal;
  private long isBuyMd;
  private long isLogin;
  private String nickName;
  private String profile;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getWxminiUnionid() {
    return wxminiUnionid;
  }

  public void setWxminiUnionid(String wxminiUnionid) {
    this.wxminiUnionid = wxminiUnionid;
  }


  public long getGroups() {
    return groups;
  }

  public void setGroups(long groups) {
    this.groups = groups;
  }


  public String getWxminiOpenid() {
    return wxminiOpenid;
  }

  public void setWxminiOpenid(String wxminiOpenid) {
    this.wxminiOpenid = wxminiOpenid;
  }


  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }


  public long getLevel() {
    return level;
  }

  public void setLevel(long level) {
    this.level = level;
  }


  public String getAlipay() {
    return alipay;
  }

  public void setAlipay(String alipay) {
    this.alipay = alipay;
  }


  public String getAlipayName() {
    return alipayName;
  }

  public void setAlipayName(String alipayName) {
    this.alipayName = alipayName;
  }


  public String getWeixin() {
    return weixin;
  }

  public void setWeixin(String weixin) {
    this.weixin = weixin;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }


  public String getIdcard() {
    return idcard;
  }

  public void setIdcard(String idcard) {
    this.idcard = idcard;
  }


  public long getRegTime() {
    return regTime;
  }

  public void setRegTime(long regTime) {
    this.regTime = regTime;
  }


  public long getLoginCount() {
    return loginCount;
  }

  public void setLoginCount(long loginCount) {
    this.loginCount = loginCount;
  }


  public long getLoginTime() {
    return loginTime;
  }

  public void setLoginTime(long loginTime) {
    this.loginTime = loginTime;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getStatusTime() {
    return statusTime;
  }

  public void setStatusTime(long statusTime) {
    this.statusTime = statusTime;
  }


  public long getIsAuth() {
    return isAuth;
  }

  public void setIsAuth(long isAuth) {
    this.isAuth = isAuth;
  }


  public long getIsWithdrawal() {
    return isWithdrawal;
  }

  public void setIsWithdrawal(long isWithdrawal) {
    this.isWithdrawal = isWithdrawal;
  }


  public long getIsBuyMd() {
    return isBuyMd;
  }

  public void setIsBuyMd(long isBuyMd) {
    this.isBuyMd = isBuyMd;
  }


  public long getIsLogin() {
    return isLogin;
  }

  public void setIsLogin(long isLogin) {
    this.isLogin = isLogin;
  }


  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

}
