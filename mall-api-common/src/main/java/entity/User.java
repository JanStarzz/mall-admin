package entity;

import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @author LuBaby
 */
public class User {
  public User() {
  }

  public User(String userId, String username, String password, String userPhoneNumber, String nickName) {
    this.userId = userId;
    this.username = username;
    this.password = password;
    this.userPhoneNumber = userPhoneNumber;
    this.nickName = nickName;
  }

  @Override
  public String toString() {
    return "User{" +
            "userId='" + userId + '\'' +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", userPhoneNumber='" + userPhoneNumber + '\'' +
            ", nickName='" + nickName + '\'' +
            '}';
  }

  @TableId
  private String userId;
  private String username;
  private String password;
  private String userPhoneNumber;
  private String nickName;

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getUserPhoneNumber() {
    return userPhoneNumber;
  }

  public void setUserPhoneNumber(String userPhoneNumber) {
    this.userPhoneNumber = userPhoneNumber;
  }

}
