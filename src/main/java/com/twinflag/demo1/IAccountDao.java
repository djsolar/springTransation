package com.twinflag.demo1;

public interface IAccountDao {

    void outMoney(String account, double money);

    void inMoney(String account, double money);
}
