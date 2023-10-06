package com.li.simpleproject.test;

import com.li.simpleproject.service.UserInfoService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

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
//        ArrayList<UserInfo> userInfos = new ArrayList<>();
//        UserInfo userInfo = new UserInfo();
//        userInfo.set
//
//        userInfoService.insert()
    }


}
