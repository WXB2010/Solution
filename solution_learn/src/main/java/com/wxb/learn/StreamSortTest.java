package com.wxb.learn;

import cn.hutool.core.date.DateUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangxianbing
 * @date 2021-08-28 16:17:36
 *
 * List<类> list; 代表某集合
 *
 * //返回 对象集合以类属性一升序排序
 *
 * list.stream().sorted(Comparator.comparing(类::属性一));
 *
 * //返回 对象集合以类属性一降序排序 注意两种写法
 *
 * list.stream().sorted(Comparator.comparing(类::属性一).reversed());//先以属性一升序,结果进行属性一降序
 *
 * list.stream().sorted(Comparator.comparing(类::属性一,Comparator.reverseOrder()));//以属性一降序
 *
 * //返回 对象集合以类属性一升序 属性二升序
 *
 * list.stream().sorted(Comparator.comparing(类::属性一).thenComparing(类::属性二));
 *
 * //返回 对象集合以类属性一降序 属性二升序 注意两种写法
 *
 * list.stream().sorted(Comparator.comparing(类::属性一).reversed().thenComparing(类::属性二));//先以属性一升序,升序结果进行属性一降序,再进行属性二升序
 *
 * list.stream().sorted(Comparator.comparing(类::属性一,Comparator.reverseOrder()).thenComparing(类::属性二));//先以属性一降序,再进行属性二升序
 *
 * //返回 对象集合以类属性一降序 属性二降序 注意两种写法
 *
 * list.stream().sorted(Comparator.comparing(类::属性一).reversed().thenComparing(类::属性二,Comparator.reverseOrder()));//先以属性一升序,升序结果进行属性一降序,再进行属性二降序
 *
 * list.stream().sorted(Comparator.comparing(类::属性一,Comparator.reverseOrder()).thenComparing(类::属性二,Comparator.reverseOrder()));//先以属性一降序,再进行属性二降序
 *
 * //返回 对象集合以类属性一升序 属性二降序 注意两种写法
 *
 * list.stream().sorted(Comparator.comparing(类::属性一).reversed().thenComparing(类::属性二).reversed());//先以属性一升序,升序结果进行属性一降序,再进行属性二升序,结果进行属性一降序属性二降序
 *
 * list.stream().sorted(Comparator.comparing(类::属性一).thenComparing(类::属性二,Comparator.reverseOrder()));//先以属性一升序,再进行属性二降序<br><br><br>
 */
public class StreamSortTest {
    public static void main(String[] args) {
        List<test> testList = new ArrayList<>();
        Date d = DateUtil.date();
        for (int i = 1; i <= 3; i++) {
            test t = new test(i, DateUtil.offsetDay(d,i));
            testList.add(t);
        }
        for (int i = 1; i <= 3; i++) {
            test t = new test(i, DateUtil.offsetMonth(d,i));
            testList.add(t);
        }

        testList.forEach(o -> {
            System.out.println(o.toString());
        });
        List<test> sort = testList.stream().sorted(Comparator.comparing(test::getState).thenComparing(test::getTime, Comparator.reverseOrder())).collect(Collectors.toList());
        System.out.println("------------------------------------");
        sort.forEach(o -> {
            System.out.println(o.toString());
        });


    }

}

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class test {
    //状态
    private int state;
    //时间
    private Date time;

}
