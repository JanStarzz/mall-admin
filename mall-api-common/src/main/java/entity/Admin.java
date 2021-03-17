package entity;

import com.baomidou.mybatisplus.annotation.TableId;
import util.Roles;

/**
 * @author LuBaby
 * @date 2021/3/17 15:52
 */
public class Admin {
    @TableId
    private String id;

    private String username;

    private String password;

    private Integer phone;

    private Roles roles;

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
