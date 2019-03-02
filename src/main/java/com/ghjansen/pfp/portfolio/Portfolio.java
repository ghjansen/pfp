package com.ghjansen.pfp.portfolio;

public abstract class Portfolio {

    private ColourCatalog colourCatalog;
    private StyleCatalog styleCatalog;
    private BehaviorCatalog behaviorCatalog;
    private ComponentCatalog componentCatalog;

    public void setColourCatalog(ColourCatalog colourCatalog) {
        this.colourCatalog = colourCatalog;
    }

    public void setStyleCatalog(StyleCatalog styleCatalog) {
        this.styleCatalog = styleCatalog;
    }

    public void setBehaviorCatalog(BehaviorCatalog behaviorCatalog) {
        this.behaviorCatalog = behaviorCatalog;
    }

    public void setComponentCatalog(ComponentCatalog componentCatalog) {
        this.componentCatalog = componentCatalog;
    }

    public ColourCatalog getColourCatalog() {
        return colourCatalog;
    }

    public StyleCatalog getStyleCatalog() {
        return styleCatalog;
    }

    public BehaviorCatalog getBehaviorCatalog() {
        return behaviorCatalog;
    }

    public ComponentCatalog getComponentCatalog() {
        return componentCatalog;
    }
}
