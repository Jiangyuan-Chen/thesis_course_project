package cn.exam.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author chenjiangyuan
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserMenuInfoVO {
    private UserVO user;
//
    private List<MenuInfoVO> menuList;
}
