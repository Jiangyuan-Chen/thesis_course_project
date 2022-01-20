package cn.exam.query;

import lombok.Data;

/**
 * @author chenjiangyuan
 */
@Data
public class PaperByUserIdQuery extends BaseQuery{
    private String userId;
}
