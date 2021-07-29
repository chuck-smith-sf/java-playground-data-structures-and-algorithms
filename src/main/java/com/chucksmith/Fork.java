package com.chucksmith;

public class Fork implements Silverware{

    private boolean clean = true;

    private final String usageString = "poke";


    @Override
    public void use() {
        System.out.println(usageString);
        clean = false;
    }

    @Override
    public void use(int numberOfUses) {
        System.out.println(usageString.repeat(numberOfUses));
    }

    @Override
    public boolean isClean() {
        return clean;
    }
}
