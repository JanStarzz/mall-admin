package entity;

import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @author LuBaby
 * @date 2021/3/3 10:46
 */
public class Category {
    @TableId
    private Integer categoryId;

    private String categoryName;

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category() {
    }
}
