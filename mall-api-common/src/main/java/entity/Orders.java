package entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

/**
 * @author LuBaby
 * @date 2021/3/10 14:00
 */
public class Orders {
    @TableId(type = IdType.ID_WORKER_STR)
    private String id;

    private Integer cartId;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime orderTime;

    private boolean ship;

    private String address;

    private String phoneNum;

    private String userId;

    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum(Object phoneNum) {
        return this.phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId='" + id + '\'' +
                ", userId='" + cartId + '\'' +
                ", orderTime=" + orderTime +
                ", check=" + ship +
                '}';
    }

    public boolean isShip() {
        return ship;
    }

    public void setShip(boolean ship) {
        this.ship = ship;
    }

    public String getOrderId() {
        return id;
    }

    public void setOrderId(String orderId) {
        this.id = orderId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }
}
