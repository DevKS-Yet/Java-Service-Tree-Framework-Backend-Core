package com.arms.devks;

import com.arms.devks.java.exercise.ChapTwo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public Start() {
        ChapTwo chapTwo = new ChapTwo();
        String[][] varTable = {
                {"boolean", "", "", ""}
                , {"", "char", "", ""}
                , {"byte", "short", "int", "long"}
                , {"", "", "float", "double"}
        };
        chapTwo.AnswerOne(varTable);
    }

}
