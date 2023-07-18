package com.arms.devks;

import org.springframework.stereotype.Component;

@Component
public class ChapThree {

    private int numOfApples;
    private int sizeOfBucket;
    private int numOfBucket;

    public int calNumOfBucket() {
        try {
//            numOfBucket = (int) Math.ceil((double)numOfApples / sizeOfBucket);
            numOfBucket = numOfApples / sizeOfBucket;
            numOfBucket += numOfApples % sizeOfBucket != 0 ? 1 : 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numOfBucket;
    }

    public void setNumbers(int numOfApples, int sizeOfBucket) {
        this.numOfApples = numOfApples;
        this.sizeOfBucket = sizeOfBucket;
    }

}
