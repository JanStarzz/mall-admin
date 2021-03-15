package entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @author LuBaby
 */
public class ShoppingcartItem {

  @TableId(type = IdType.AUTO)
  private Integer id;
  private Integer shoppingcartId;
  private Integer productId;
  private Integer count;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getShoppingcartId() {
    return shoppingcartId;
  }

  public void setShoppingcartId(Integer shoppingcartId) {
    this.shoppingcartId = shoppingcartId;
  }


  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

}
