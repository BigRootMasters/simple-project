package com.li.simpleproject.common.util;

import com.li.simpleproject.entity.User;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author kuan
 * @version 1.0
 * @description: stream模板
 * @date 2023/10/6 18:01
 */

@Slf4j
public class StreamUtil {

    private static List<User> getUserList() {
        return new ArrayList<User>() {{
            add(new User("周润发", "166", 52));
            add(new User("周星驰", "155", 42));
            add(new User("刘德华", "177", 62));
            add(new User("伍佰", "188", 45));
            add(new User("周传雄", "133", 40));
            add(new User("甄子丹", "199", 45));
        }};
    }


    public static void main(String[] args) {
        // 知道一个List<User>对象，如何获取List<User>的所有用户手机号？
        List<User> userList = getUserList();


        List<String> phoneList = userList.stream().map(User::getPhone).toList();
        // 打印内容 - 所有用户手机号为 [166, 155, 177, 188, 133, 199]
        log.info("所有用户手机号为 " + phoneList);


        List<User> filterUserList = userList.stream().filter(u -> u.getAge() > 50).toList();
        // 打印内容 - 年龄大于50的用户为 [JAVA8.User(name=周润发, phone=166, age=52), JAVA8.User(name=刘德华, phone=177, age=62)]
        log.info("年龄大于50的用户为 " + filterUserList);

        List<User> ascUserList = userList.stream().sorted(Comparator.comparing(User::getAge)).toList();
        List<User> reversedUserList = userList.stream().sorted(Comparator.comparing(User::getAge).reversed()).toList();
        // 打印内容 - 年龄从小到大 [JAVA8.User(name=周传雄, phone=133, age=40), JAVA8.User(name=周星驰, phone=155, age=42), JAVA8.User(name=伍佰, phone=188, age=45), JAVA8.User(name=甄子丹, phone=199, age=45), JAVA8.User(name=周润发, phone=166, age=52), JAVA8.User(name=刘德华, phone=177, age=62)]
        log.info("年龄从小到大 " + ascUserList);
        // 打印内容 - 年龄从大到小 [JAVA8.User(name=刘德华, phone=177, age=62), JAVA8.User(name=周润发, phone=166, age=52), JAVA8.User(name=伍佰, phone=188, age=45), JAVA8.User(name=甄子丹, phone=199, age=45), JAVA8.User(name=周星驰, phone=155, age=42), JAVA8.User(name=周传雄, phone=133, age=40)]
        log.info("年龄从大到小 " + reversedUserList);


        Map<Integer, List<User>> groupingUserList = userList.stream().collect(Collectors.groupingBy(User::getAge));
        // 打印内容 - 相同年龄进行分组 {52=[JAVA8.User(name=周润发, phone=166, age=52)], 40=[JAVA8.User(name=周传雄, phone=133, age=40)], 42=[JAVA8.User(name=周星驰, phone=155, age=42)], 45=[JAVA8.User(name=伍佰, phone=188, age=45), JAVA8.User(name=甄子丹, phone=199, age=45)], 62=[JAVA8.User(name=刘德华, phone=177, age=62)]}
        log.info("相同年龄进行分组 " + groupingUserList);
        // 知道一个List<User>对象，如何按照相同年龄进行分组后获取其对应数量？
        Map<Integer, Long> countUserList = userList.stream().collect(Collectors.groupingBy(User::getAge, Collectors.counting()));
        // 打印内容 - 相同年龄进行分组的数量 {52=1, 40=1, 42=1, 45=2, 62=1}
        log.info("相同年龄进行分组的数量 " + countUserList);


    }

}
