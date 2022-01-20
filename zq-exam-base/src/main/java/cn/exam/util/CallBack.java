
package cn.exam.util;

import java.util.List;

/**
 * 回调函数
 * @author chenjiangyuan
 * @File CallBack
 * @Description 回调函数
 */
public interface CallBack<T> {
	/**
	 * 回调函数
	 */
    List<T> callBack();
}
