package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @author LuBaby
 * @date 2021/3/10 14:04
 */
public class OrderItem {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String orderId;

    private Integer productId;

    private Integer count;

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", productId=" + productId +
                ", count=" + count +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
