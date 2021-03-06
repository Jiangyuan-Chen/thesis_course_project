/**
 * 	Copyright 2020 www.zj.cn
 *
 * 	All right reserved
 *
 * 	Create on 2020/5/20 05:20
 */
package cn.exam.dao.mapper.zj;

import cn.exam.dao.mapper.base.CommonBaseMapper;
import cn.exam.query.RoleQuery;
import cn.exam.domain.zj.ZjRole;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ZjRoleMapper
        extends CommonBaseMapper<ZjRole> {
    List<ZjRole> queryPage(RoleQuery query);


}
