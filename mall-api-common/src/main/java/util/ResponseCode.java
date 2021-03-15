package util;

/**
 * @author LuBaby
 */
public enum ResponseCode {
    /**
     * 未知错误
     */
    UNKNOWN_ERROR("-1", "未知错误"),

    /**
     * 成功
     */
    SUCCESS("200", "成功"),

    /**
     * 参数不合法
     */
    PARAM_ERROR("201", "参数不合法"),

    /**
     * 数据库异常
     *
     */
    DATABASE_ERROR("202", "数据库异常");


    private String code;
    private String message;

    ResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
