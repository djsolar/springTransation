package com.twinflag.demo1;

public class AccountServiceImp implements IAccountService {

    private IAccountDao accountDao;

    public void transfer(String out, String in, double money) {
        accountDao.outMoney(out, money);
        int i = 1 / 0;
        accountDao.inMoney(in, money);
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
