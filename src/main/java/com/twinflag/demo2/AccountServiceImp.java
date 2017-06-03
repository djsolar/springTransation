package com.twinflag.demo2;


import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AccountServiceImp implements IAccountService {

    private IAccountDao accountDao;

    public void transfer(String out, String in, double money) {
        accountDao.outMoney(out, money);
        accountDao.inMoney(in, money);
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
