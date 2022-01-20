package cn.exam.util;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 分页工具类
 */
public class PageUtil {

    public static<T> PageResult<List<T>> execute(CallBack<T> callBack,Object obj){

        Class<?> cls = obj.getClass();
        cls=cls.getSuperclass();
        Map<String,Object> map = new HashMap<>();
        //得到所有属性
        Field[] fields = cls.getDeclaredFields();
        //遍历
        for (Field item : fields) {
            try {
                //得到属性
                //打开私有访问
                item.setAccessible(true);
                //获取属性
                String name = item.getName();
                //获取属性值
                Object value = item.get(obj);
                map.put(name, value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        PageHelper.startPage((int)map.get("currentNum"), (int)map.get("pageSize"));
		List<T> list = callBack.callBack();
        PageInfo<T> pageInfo = new PageInfo<>(list);
        return new PageResult<>(pageInfo.getTotal(), list);
    }
}
