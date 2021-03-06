package cn.exam.service;

import cn.exam.query.UserQuery;
import cn.exam.util.PageResult;
import cn.exam.vo.UserPageVO;
import cn.exam.vo.UserVO;

import java.util.List;

/**
 * @author chenjiangyuan
 */
public interface UserInfoService {

    UserVO queryUserInfoByName(String userId);


    PageResult<List<UserPageVO>>queryPage(UserQuery  query );
}
