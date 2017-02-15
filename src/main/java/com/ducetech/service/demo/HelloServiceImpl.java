package com.ducetech.service.demo;

import org.apache.thrift.TException;

/**
 * Created by lenzhao on 17-2-15.
 */
public class HelloServiceImpl implements HelloService.Iface {
    @Override
    public String hellostring(String para) throws TException {
        return para;
    }

    @Override
    public int helloInt(int para) throws TException {
        return para;
    }

    @Override
    public boolean helloBoolean(boolean para) throws TException {
        return para;
    }

    @Override
    public void helloVoid() throws TException {
        System.out.println("Hello World");
    }

    @Override
    public String helloNull() throws TException {
        return null;
    }
}
