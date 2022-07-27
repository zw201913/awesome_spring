package com.example.awesomespring.controller;

import com.example.awesomespring.dao.entity.Account;
import com.example.awesomespring.dao.mapper.AccountMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zouwei
 * @className UserController
 * @date: 2022/7/16 下午11:13
 * @description:
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

	@Autowired
	private AccountMapper accountMapper;

	@GetMapping("/{id}")
	String getUserInfo(@PathVariable String id) {
		log.info("获取用户信息开始");
		log.info("请求参数 id:{}", id);
		Account account = accountMapper.selectByPrimaryKey(id);
		log.info("获取用户信息结束");
		return account.getAccount();
	}
}