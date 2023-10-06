package com.li.simpleproject.controller;

import com.li.simpleproject.entity.UserInfo;
import com.li.simpleproject.service.UserInfoService;
import jakarta.annotation.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * 用户信息表(UserInfo)表控制层
 *
 * @author lk
 * @since 2023-10-06 04:29:39
 */
@RestController
@RequestMapping("userInfo")
public class UserInfoController {
    /**
     * 服务对象
     */
    @Resource
    private UserInfoService userInfoService;

    /**
     * 分页查询
     *
     * @param userInfo    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<UserInfo>> queryByPage(UserInfo userInfo, PageRequest pageRequest) {
        return ResponseEntity.ok(this.userInfoService.queryByPage(userInfo, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UserInfo> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.userInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param userInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Integer> add(UserInfo userInfo) {
        return ResponseEntity.ok(this.userInfoService.insert(userInfo));
    }

    /**
     * 编辑数据
     *
     * @param userInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UserInfo> edit(UserInfo userInfo) {
        return ResponseEntity.ok(this.userInfoService.update(userInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Long id) {
        return ResponseEntity.ok(this.userInfoService.deleteById(id));
    }

}

