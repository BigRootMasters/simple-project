package com.li.simpleproject.controller;

import com.li.simpleproject.common.enums.DeleteEnum;
import com.li.simpleproject.entity.UserInfo;
import com.li.simpleproject.service.UserInfoService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Date;

@SpringBootTest
@ActiveProfiles("dev")
@Slf4j
class UserInfoControllerTest {
    @Resource
    UserInfoService userInfoService;

    @Test
    void queryByPage() {
        UserInfo userInfo1 = new UserInfo();
        userInfo1.setUserName("test");
        int page = 1;
        int size = 3;
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<UserInfo> userInfos = userInfoService.queryByPage(userInfo1, pageRequest);
        log.info("page:{}", userInfos);
    }

    @Test
    void queryById() {
        UserInfo userInfo = userInfoService.queryById(2L);
        log.info("UserInfo:{}", userInfo);
    }

    @Test
    void add() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("test");
        userInfo.setUserImage("3");
        userInfo.setPassword("1");
        userInfo.setCreatedTime(new Date());
        userInfo.setUpdatedTime(new Date());
        userInfo.setRegisterTime(new Date());
        userInfo.setDeleteStatus(DeleteEnum.NOT_DELETED.getCode());
        int insert = userInfoService.insert(userInfo);
        log.info("UserInfo:{}", insert);
    }

    @Test
    void edit() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(2L);
        userInfo.setUserName("test2");
        userInfo.setUserImage("2");
        userInfo.setPassword("2");
        UserInfo update = userInfoService.update(userInfo);
        log.info("UserInfo:{}", update);
    }

    @Test
    void deleteById() {
    }
}