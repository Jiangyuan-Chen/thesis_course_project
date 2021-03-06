package cn.exam.domain.zj;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author chenjiangyuan
 */
@Data
@Table(name = "zj_title_info")
public class ZjTitleInfo implements Serializable {
    /**
     * 题目id
     */
    @Id
    @Column(name ="title_id")
    private Integer titleId;
    /**
     * 题目
     */
    @Column(name ="title_name")
    private String titleName;

    @Column(name = "class_id")
    private Integer classId;
    /**
     * 难度系数
     */
    @Column(name ="title_type")
    private Double titleType;
    /**
     * 分数
     */
    @Column(name ="title_fraction")
    private Integer titleFraction;
    /**
     * 答案
     */
    @Column(name ="title_answer")
    private String titleAnswer;
    /**
     * 0单选题（a,b,c,d,e,f）  1 填空（0对 1错） 2主观
     */
    @Column(name ="title_status")
    private Integer titleStatus;
    /**
     * 选项A
     */
    @Column(name ="choice1")
    private String choice1;
    /**
     * 选项B
     */
    @Column(name ="choice2")
    private String choice2;
    /**
     * 选项C
     */
    @Column(name ="choice3")
    private String choice3;
    /**
     * 选项D
     */
    @Column(name ="choice4")
    private String choice4;

    /**
     * 出题人id
     */
    @Column(name ="user_id")
    private String userId;
    /**
     * 出题人姓名
     */
    @Column(name ="user_name")
    private String userName;
    /**
     *
     */
    @Column(name ="create_time")
    private String createTime;
    /**
     *
     */
    @Column(name ="update_time")
    private String updateTime;
    @Column(name="subject_id")
    private Integer subjectId;
}
