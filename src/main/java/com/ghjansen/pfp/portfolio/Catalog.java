package com.ghjansen.pfp.portfolio;

public abstract class Catalog<T> {

    protected T catalog;

    public Catalog(T catalog) {
        this.catalog = catalog;
    }

    protected abstract void load();

}
