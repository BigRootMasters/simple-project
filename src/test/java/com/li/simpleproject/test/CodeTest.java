package com.li.simpleproject.test;

import com.li.simpleproject.entity.UserInfo;
import com.li.simpleproject.service.UserInfoService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Date;

/**
 * @author kuan
 * @version 1.0
 * @description: 单元测试
 * @date 2023/10/6 16:16
 */

@SpringBootTest
@ActiveProfiles("dev")
@Slf4j
public class CodeTest {

    @Resource
    UserInfoService userInfoService;

    @Test
    public void testLog() {
        log.info("log start");
    }


    @Test
    public void testDB() {

        UserInfo userInfo = new UserInfo();
        userInfo.setId(0L);
        userInfo.setUserName("");
        userInfo.setUserImage("");
        userInfo.setPassword("");
        userInfo.setCreatedTime(new Date());
        userInfo.setUpdatedTime(new Date());
        userInfo.setRegisterTime(new Date());
        userInfo.setDeleteStatus("");
        userInfoService.insert(userInfo);
    }


    @Test
    public void testFinally() {
        String s = testFin();
        log.info(s);
    }

    public String testFin(){
        try {
            log.info("log try");
            throw new RuntimeException("Exception");
        } catch (Exception e) {
            log.info("log ex");
            return "catch";
        } finally {
            log.info("finally");
        }
    }

}
