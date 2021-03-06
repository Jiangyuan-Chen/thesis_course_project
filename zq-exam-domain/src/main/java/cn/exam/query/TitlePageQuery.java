package cn.exam.query;

import lombok.Data;

/**
 * @author chenjiangyuan
 */
@Data
public class TitlePageQuery extends BaseQuery {
    private String titleName;
    private String subjectName;
    private String className;
    private String titleType;
    private String titleFraction;

}
