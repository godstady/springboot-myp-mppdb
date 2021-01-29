package com.dataql.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {

    /**
     *   获取当前时间
     */

    public static String getTime() {
        Date nowTime = new Date(System.currentTimeMillis());
        SimpleDateFormat sdFormatter = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String time = sdFormatter.format(nowTime);
        return time;
    }


    /**
     *  获取当前 年月日
     * @return
     */
    public static String getYMD() {
        Date nowTime = new Date(System.currentTimeMillis());
        SimpleDateFormat sdFormatter = new SimpleDateFormat("YYYY-MM-dd");
        String time = sdFormatter.format(nowTime);
        return time;
    }


    /**
     * 两个时间相差距离多少天多少小时多少分多少秒
     *
     * @param str1
     *            时间参数 1 格式：1990-01-01 12:00:00
     * @param str2
     *            时间参数 2 格式：2009-01-01 12:00:00
     * @return long[] 返回值为：{天, 时, 分, 秒}
     * @throws ParseException
     */
    public static String getDistanceTimes(String str1, String str2) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date one;
        Date two;
        long day = 0;
        long hour = 0;
        long min = 0;
        long sec = 0;
        try {
            one = df.parse(str1);
            two = df.parse(str2);
            long time1 = one.getTime();
            long time2 = two.getTime();
            long diff;
            if (time1 < time2) {
                diff = time2 - time1;
            } else {
                diff = time1 - time2;
            }
            day = diff / (24 * 60 * 60 * 1000);
            hour = (diff / (60 * 60 * 1000) - day * 24);
            min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);
            sec = (diff / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String h =  hms(hour);
        String m =  hms(min);
        String s =  hms(sec);
        String times =  h +":" + m  + ":" + s ;
        return times;
    }

    static String hms(Long T){
        String t = "";
        if(T <= 9){
            t = "0" + T;
        }else {
            t = "" + T;
        }
        return t;
    }

    public static void main(String[] args){

        String times = getDistanceTimes("2018-11-11 08:01:00", "2018-11-12 07:11:18");
        System.out.println(times);
    }


}
