package com.ghjansen.pfp.catalog;

import com.ghjansen.pfp.control.ExceptionController;
import com.ghjansen.pfp.exception.DuplicateNameException;

public abstract class Catalog<T> {

    protected T catalog;

    public Catalog(T catalog) {
        this.catalog = catalog;
        load();
    }

    protected abstract void load();

}
