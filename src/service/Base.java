package service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Base {
    protected ClassPathXmlApplicationContext ctx;

    public Base() {
        super();
    }

    public void initCtx() {
        String cfg = "/applicationContext.xml";
        ctx = new ClassPathXmlApplicationContext(cfg);
    }
}
