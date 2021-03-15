package util;

import entity.ResponseEntity;

/**
 * 创建响应对象工具
 * @author LuBaby
 * @date 2021/3/5 10:43
 */
public class ResponseEntityUtil {

    /**
     * @param @param  object
     * @param @return 设定文件
     * @return ResponseEntity 返回类型
     * @Title: success
     * @Description: 成功有返回
     */
    public static ResponseEntity success(Object object) {
        ResponseEntity ResponseEntity = new ResponseEntity(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMessage());
        ResponseEntity.setData(object);
        return ResponseEntity;
    }

    /**
     * @param @return 设定文件
     * @return ResponseEntity 返回类型
     * @Title: success
     * @Description: 成功无返回
     */
    public static ResponseEntity success() {
        return ResponseEntityUtil.success(null);
    }

    /**
     * @param @param  object
     * @param @return 设定文件
     * @return ResponseEntity 返回类型
     * @Title: success
     * @Description: 参数不合法返回
     */
    public static ResponseEntity paramError(Object object) {
        ResponseEntity ResponseEntity = new ResponseEntity(ResponseCode.PARAM_ERROR.getCode(), ResponseCode.PARAM_ERROR.getMessage());
        ResponseEntity.setData(object);
        return ResponseEntity;
    }

    /**
     * @return ResponseEntity 返回类型
     * @Title: paramError
     * @Description: 参数不合法返回
     */
    public static ResponseEntity paramError() {
        return new ResponseEntity(ResponseCode.PARAM_ERROR.getCode(), ResponseCode.PARAM_ERROR.getMessage());
    }

    /**
     * 返回自定义状态码及msg
     * @param code
     * @param msg
     * @return
     */
    public static ResponseEntity customResponseEntityParam(String code, String msg) {
        return new ResponseEntity(code, msg);
    }
    /**
     * @return ResponseEntity 返回类型
     * @Title: paramError
     * @Description: 数据库错误
     */
    public static ResponseEntity dataBaseError() {
        return new ResponseEntity(ResponseCode.DATABASE_ERROR.getCode(), ResponseCode.DATABASE_ERROR.getMessage());
    }
    /**
     * @param @param  code
     * @param @param  msg
     * @param @return 设定文件
     * @return ResponseEntity 返回类型, 错误返回时状态码为 9999
     * @Title: error
     * @Description: 失败方法返回
     */
    public static ResponseEntity error(String code, String msg) {
        ResponseEntity ResponseEntity = new ResponseEntity(code, msg);
        return ResponseEntity;
    }

    /**
     * 自定义返回
     * @param code
     * @param msg
     * @return
     */
    public static ResponseEntity customize(String code, String msg){
        ResponseEntity ResponseEntity = new ResponseEntity(code, msg);
        return ResponseEntity;
    }

    /**
     * 自定义返回
     * @param code
     * @param msg
     * @return
     */
    public static ResponseEntity customize(String code, String msg, Object o){
        ResponseEntity ResponseEntity = new ResponseEntity(code, msg, o);
        return ResponseEntity;
    }
}
