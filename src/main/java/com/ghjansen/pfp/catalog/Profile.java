package com.ghjansen.pfp.catalog;

public class Profile {

    private StyleCatalog styleCatalog;
    private BehaviorCatalog behaviorCatalog;

    public Profile(StyleCatalog styleCatalog, BehaviorCatalog behaviorCatalog){
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
