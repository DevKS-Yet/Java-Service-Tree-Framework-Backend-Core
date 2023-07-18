package com.arms.devks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // @Autowire로 자동주입
//    @Autowired
//    private Tv tv;

    // 생성자를 통한 주입
    private final ChapThree chapThree;

    public Start(ChapThree chapThree) {
        this.chapThree = chapThree;
        logger.info("Chap3-----------------------------------------------------------");
        chapThree.setNumbers(123, 10);
        logger.info("필요한 바구니의 수 : {}", chapThree.calNumOfBucket());
        logger.info("----------------------------------------------------------Chap3");
    }

}
