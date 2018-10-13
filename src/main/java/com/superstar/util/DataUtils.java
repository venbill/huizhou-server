package com.superstar.util;


import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by yuwb on 2017/10/11.
 * 基础数据类型数据工具类
 */
public class DataUtils {


    public static boolean isNotEmpty(String str) {
        if (str != null && str.length() > 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isNotBlank(String str) {
        if (str != null && str.length() > 0 && !str.equals(" ")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean notAnyEmpty(String... strArray) {
        for (String str : strArray) {
            if (isEmpty(str)) {
                return false;
            }
        }
        return true;
    }


    public static boolean isEmpty(String str) {
        return !isNotEmpty(str);
    }

    public static boolean isEmpty(List list) {
        return list==null||list.size()==0;
    }


    public static boolean isNotNull(String str) {
        return str != null;
    }

    public static boolean isNull(String str) {
        return str == null;
    }

    public static boolean isPositive(Integer number) {
        if (number != null && number > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPositive(Integer... arr){
        for (Integer i:arr) {
            if(!isPositive(i)){
                return false;
            }
        }

        return true;
    }

    public static boolean isPositive(Long number) {
        if (number != null && number > 0) {
            return true;
        } else {
            return false;
        }
    }



    public static boolean objInList(Object obj,List list){
        for (Object o:list) {
            if(obj.equals(o)){
                return true;
            }
        }
        return false;
    }



    public static boolean match(String regex,String str){
        Pattern p = Pattern.compile(regex);
        return p.matcher(str).find();
    }



}
