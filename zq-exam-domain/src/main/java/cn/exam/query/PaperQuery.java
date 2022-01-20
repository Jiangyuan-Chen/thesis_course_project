package cn.exam.query;

import lombok.Data;

/**
 * @author chenjiangyuan
 */
@Data
public class PaperQuery extends BaseQuery {

    private Integer classId;
    private String userId;
}
