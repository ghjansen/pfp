package com.ghjansen.pfp.catalog;

public abstract class Theme {

    private StyleCatalog styleCatalog;
    private BehaviorCatalog behaviorCatalog;

    public Theme(StyleCatalog styleCatalog, BehaviorCatalog behaviorCatalog){
        this.styleCatalog = styleCatalog;
        this.behaviorCatalog = behaviorCatalog;
    }

    public StyleCatalog getStyleCatalog() {
        return styleCatalog;
    }

    public BehaviorCatalog getBehaviorCatalog() {
        return behaviorCatalog;
    }
}
