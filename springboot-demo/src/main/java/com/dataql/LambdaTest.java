package com.dataql;

import com.dataql.bean.Usertest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static org.apache.coyote.http11.Constants.a;

/**
 * Created by godstady on 2021/1/26.
 */
public class LambdaTest {

    public static void main(String[] args) {
//        Runnable runnable = () -> System.out.println("stes");
//        runnable.run();



//            processFile((BufferedReader br, String str) -> br.readLine()+br.readLine());


        List<Integer> user = Arrays.asList(1,23,4,6,9);

        List<Usertest> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            Usertest bean = new Usertest();
            bean.setCreateDate(LocalDateTime.now());
            bean.setId(i);
            bean.setName("张三");
            bean.setAge(i*10);
            list.add(bean);
        }

        List<Integer> collect = user.stream().filter(a -> a > 10).collect(Collectors.toList());
        System.out.println(collect);


        list.stream().map(Usertest::getName).collect(Collectors.toList()).forEach(System.out::println);

        Usertest usertest = list.stream().filter((a) -> "张三".equals(a.getName()))
                .max(Comparator.comparing(Usertest::getAge)).get();
        System.out.println(usertest.getAge());

       // list.stream().forEach(o->o.setName("李四"));

        StringBuffer str = new StringBuffer();
        list.forEach(o-> {str.append(o.getName()); System.out.println(o.getName());});

        System.out.println(str);


        List<Usertest> collect1 = list.stream().filter(a -> 10 == a.getAge()).collect(Collectors.toList());
        
    }


}
