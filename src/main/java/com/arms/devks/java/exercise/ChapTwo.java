package com.arms.devks.java.exercise;

public class ChapTwo {

    public void AnswerOne(String[][] varTable) {
        new QuestionOne(varTable);
    }

    /**
     * 이중 for문과 이중 if문을 대체할 수 있는 방도는?
     * 이중 for문은 Two Dimension이라서 이중 for문을 사용해야지만 이중 if문으로 너무 유효성이 아닌 조건을 처리할려고 한 것이 아닌지?
     */
    class QuestionOne {
        private String[][] fixedTable = {
                {"종\\크", "1 byte", "2 byte", "4 byte", "8byte"}
                , {"논리형", "", "", "", ""}
                , {"문자형", "", "", "", ""}
                , {"정수형", "", "", "", ""}
                , {"실수형", "", "", "", ""}
        };

        QuestionOne(String[][] varTable) {
            int columnNum = 0;
            int rowNum = 0;
            for (int i=0; i < fixedTable.length; i++) {
                for (int j=0; j < fixedTable[i].length; j++) {
                    if (fixedTable[i][j].equals("")) {
                        fixedTable[i][j] = varTable[columnNum][rowNum];
                        if (rowNum < varTable[columnNum].length - 1) rowNum++;
                        else {
                            columnNum++;
                            rowNum = 0;
                        }
                    }
                    System.out.print(fixedTable[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

}
