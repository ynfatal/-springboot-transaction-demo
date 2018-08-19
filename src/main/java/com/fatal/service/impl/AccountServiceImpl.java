package com.fatal.service.impl;

import com.fatal.mapper.AccountMapper;
import com.fatal.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Fatal
 * @date: 2018/8/19 0019 21:06
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    @Transactional
    public void update() {
        accountMapper.update(90d,1);//用户1减10块 用户2加10块
        Integer i=1/0;
        accountMapper.update(110d,2);
    }

}
