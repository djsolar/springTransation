package com.twinflag.demo2;

public interface IAccountDao {

    void outMoney(String account, double money);

    void inMoney(String account, double money);
}
