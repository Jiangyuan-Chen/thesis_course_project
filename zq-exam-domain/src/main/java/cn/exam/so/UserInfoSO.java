package cn.zq.exam.so;

import lombok.Data;

/**
 * @author chenjiangyuan
 */
@Data
public class UserInfoSO {
    /**
     * 学号  或 教师号
     */
    private String userId;



    private Integer typeId;

    /**
     * 密码
     */
    private String password;

    private String userName;

    private String confirmPassword;

    private String isDelete;

    private Integer classId;





}
