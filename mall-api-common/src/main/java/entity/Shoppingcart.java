package entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @author LuBaby
 */
public class Shoppingcart {

  @TableId(type = IdType.AUTO)
  private Integer id;
  private String userId;

  public Shoppingcart() {
  }

  public Shoppingcart(Integer id, String userId) {
    this.id = id;
    this.userId = userId;
  }


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

}
