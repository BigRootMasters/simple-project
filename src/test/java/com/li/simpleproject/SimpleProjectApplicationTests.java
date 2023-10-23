package com.li.simpleproject;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@ActiveProfiles("dev")
@Slf4j
class SimpleProjectApplicationTests {

    @Test
    void contextLoads() {
        log.info("log info");
        System.out.println("test context");
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        List<Integer> list = integers.stream().sorted().toList();
        System.out.println(list);
    }

}
