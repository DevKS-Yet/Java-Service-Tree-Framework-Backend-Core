package com.arms.devks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public Start() {
        logger.info("---------------------------------------------------------------");
        test();
    }

    public void test() {
        Tv tv = new Tv();
        logger.info("isPower = {}", tv.power);
        logger.info("channel = {}", tv.channel);
    }

}
