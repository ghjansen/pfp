package com.ghjansen.pfp.catalog;

public abstract class Catalog<E extends Enum<E>> {

    protected E catalog;

    public Catalog(){
        this.catalog = create();
    }

    protected abstract E create();

}
