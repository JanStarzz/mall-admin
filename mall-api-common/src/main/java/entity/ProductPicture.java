package entity;


import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @author LuBaby
 */
public class ProductPicture {

  @TableId
  private Integer id;
  private Integer productId;
  private String productPicture;
  private String intro;

  public ProductPicture() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public String getProductPicture() {
    return productPicture;
  }

  public void setProductPicture(String productPicture) {
    this.productPicture = productPicture;
  }

  public String getIntro() {
    return intro;
  }

  public void setIntro(String intro) {
    this.intro = intro;
  }
}
