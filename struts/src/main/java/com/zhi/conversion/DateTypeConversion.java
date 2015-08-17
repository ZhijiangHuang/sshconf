package com.zhi.conversion;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/**
 * Created by root on 2015-8-17.
 */
public class DateTypeConversion extends StrutsTypeConverter {

    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        System.out.println("正在转换，从字符串转为目标object");
        Calendar calendar = Calendar.getInstance();
        String[] timeString = strings[0].split("/");
        calendar.set(Integer.valueOf(timeString[0]),Integer.valueOf(timeString[1]),
                Integer.valueOf(timeString[2]));
        return calendar.getTime();
    }

    @Override
    public String convertToString(Map map, Object o) {
        System.out.println("从object转为字符串");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime((Date) o);
        String res = calendar.get(Calendar.YEAR)+"/"+calendar.get(Calendar.MONTH)+"/"+
                calendar.get(Calendar.DATE);
        return res;
    }
}
