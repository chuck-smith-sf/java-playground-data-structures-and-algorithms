package com.chucksmith;

public class Spoon implements Silverware{
    public void supperScoop(){
        System.out.println("It's going to be a big bit so get ready");
    }

    @Override
    public void use() {

    }

    @Override
    public void use(int numberOfUses) {

    }

    @Override
    public boolean isClean() {
        return false;
    }
}
