package util;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @author LuBaby
 * @date 2021/3/17 16:18
 */
public enum Roles {

    /**
     * 最高级别管理员，拥有一切权限
     */
    ADMIN (0,"管理员"),

    /**
     * 订单管理员
     */
    ORDER(1,"订单管理员"),

    /**
     * 商品管理员
     */
    PRODUCT(2,"商品管理员");


    @EnumValue
    private Integer role;

    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    Roles(Integer role, String roleName) {
        this.role = role;
        this.roleName = roleName;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
