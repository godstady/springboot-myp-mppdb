package com.dataql.util;


import org.apache.commons.lang.StringUtils;
import java.lang.reflect.Field;

public class EmptyUtil {

    public static void main(String[] args) {
//        User user1 = new User("Jack","male",17);
//        User user2 = new User();
//        User user3 = new User("Jack","",0);
//
//        boolean u1Flag = checkObjAllFieldsIsNull(user1);
//        boolean u2Flag = checkObjAllFieldsIsNull(user2);
//
//        System.out.println("user1 是否为空：" + u1Flag);
//        System.out.println("user2 是否为空：" + u2Flag);


    }

    /**
     * 判断对象中属性值是否全为空
     *
     * @param object
     * @return
     */
    public static boolean checkObjAllFieldsIsNull(Object object) {
        if (null == object) {
            return true;
        }

        try {
            for (Field f : object.getClass().getDeclaredFields()) {
                f.setAccessible(true);

                System.out.print(f.getName() + ":");
                System.out.println(f.get(object));

                if (f.get(object) != null && StringUtils.isNotBlank(f.get(object).toString())) {
                    return false;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return true;
    }

}
