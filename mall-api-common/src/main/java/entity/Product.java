package entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;



/**
 * @author LuBaby
 */
public class Product {

  @TableId(type = IdType.AUTO)
  private Integer productId;
  private String productName;
  private Integer categoryId;
  private String productTitle;
  private String productIntro;
  private String productPicture;
  private double productPrice;
  private double productSellingPrice;
  private Integer productNum;
  private Integer productSales;

  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public String getProductTitle() {
    return productTitle;
  }

  public void setProductTitle(String productTitle) {
    this.productTitle = productTitle;
  }

  public String getProductIntro() {
    return productIntro;
  }

  public void setProductIntro(String productIntro) {
    this.productIntro = productIntro;
  }

  public String getProductPicture() {
    return productPicture;
  }

  public void setProductPicture(String productPicture) {
    this.productPicture = productPicture;
  }

  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }

  public double getProductSellingPrice() {
    return productSellingPrice;
  }

  public void setProductSellingPrice(double productSellingPrice) {
    this.productSellingPrice = productSellingPrice;
  }

  public Integer getProductNum() {
    return productNum;
  }

  public void setProductNum(Integer productNum) {
    this.productNum = productNum;
  }

  public Integer getProductSales() {
    return productSales;
  }

  public void setProductSales(Integer productSales) {
    this.productSales = productSales;
  }

  public Product() {
  }
}
