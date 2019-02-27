package com.ghjansen.pfp.catalog;

public abstract class Catalog<T> {

    protected T catalog;

    public Catalog(T catalog){
        this.catalog = catalog;
        createAndAddElements();
    }

    protected abstract void createAndAddElements();

}
