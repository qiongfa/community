package com.swy.community.dao;

import org.springframework.stereotype.Repository;

@Repository("aaa")
public class AlphaDaoHibernateImpl implements AlphaDao {
    @Override
    public String select() {
        return "qwer";
    }
}
