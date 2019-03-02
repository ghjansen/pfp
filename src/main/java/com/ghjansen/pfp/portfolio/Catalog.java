package com.ghjansen.pfp.portfolio;

public abstract class Catalog<T> {

    protected T catalog;

    public Catalog(T catalog) {
        this.catalog = catalog;
        load();
    }

    protected abstract void load();

}
