package entity;


import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @author LuBaby
 */
public class Carousel {

  @TableId
  private Integer carouselId;
  private String imgPath;
  private String describes;

  public Integer getCarouselId() {
    return carouselId;
  }

  public void setCarouselId(Integer carouselId) {
    this.carouselId = carouselId;
  }

  public String getImgPath() {
    return imgPath;
  }

  public void setImgPath(String imgPath) {
    this.imgPath = imgPath;
  }

  public String getDescribes() {
    return describes;
  }

  public void setDescribes(String describes) {
    this.describes = describes;
  }

  public Carousel() {
  }
}
