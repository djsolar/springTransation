package com.twinflag.demo1;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    public void outMoney(String account, double money) {
        String sql = "update account SET money = money - ? WHERE name = ?";
        getJdbcTemplate().update(sql, money, account);
    }

    public void inMoney(String account, double money) {
        String sql = "update account SET money = money + ? WHERE name = ?";
        getJdbcTemplate().update(sql, money, account);
    }
}
