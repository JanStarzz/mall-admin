package entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author LuBaby
 * @date 2021/3/12 17:33
 */
public class OrderShow {
    private String id;

    private Integer cartId;

    private LocalDateTime orderTime;

    private boolean ship;

    private String address;

    private String phoneNum;

    private String createTime;

    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime() {
        String format = "yyyy-MM-dd HH:mm:ss";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);

        this.createTime = this.orderTime.format(formatter);
    }

    private List<OrderItemsShow> orderItemsShows;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        this.setCreateTime();

    }

    public boolean isShip() {
        return ship;
    }

    public void setShip(boolean ship) {
        this.ship = ship;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public List<OrderItemsShow> getOrderItemsShows() {
        return orderItemsShows;
    }

    public void setOrderItemsShows(List<OrderItemsShow> orderItemsShows) {
        this.orderItemsShows = orderItemsShows;
    }
}
