package cn.exam.so;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenjiangyuan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleMenuIdSO {
    private String roleId;
    private String menuIdString;
}
