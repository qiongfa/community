package com.swy.community.service;

import com.swy.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AlphaService {

    @Autowired
    @Qualifier("bbb")
    private AlphaDao alphadao;

    public String find() {
        return alphadao.select();
    }
}
