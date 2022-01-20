package cn.exam.util;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

/**
 * easyexcel工具类 -- Excel解析
 *
 * @author Lynch
 */
public class EasyExcelUtil {

    /**
     * 	网页上的下载导出
     * @param fileName 文件名
     * @param clazz  类的字节码文件
     * @param datas 导出的数据
     * @throws IOException 异常对象
     */
    public static void writeWeb(String fileName, final Class<?> clazz,List<?> datas,HttpServletResponse response) throws IOException {
        // 直接用浏览器或者用postman
    	OutputStream outputStream = response.getOutputStream();
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码
        fileName = URLEncoder.encode(fileName, "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName );
        ExcelWriter excelWriter = EasyExcel.write(response.getOutputStream()).build();
        //这里需要指定写用哪个class去写
    	WriteSheet writeSheet = EasyExcel.writerSheet(0, "sheet1").head(clazz).build();
    	excelWriter.write(datas, writeSheet);

        outputStream.flush();
		excelWriter.finish();
	}
}
