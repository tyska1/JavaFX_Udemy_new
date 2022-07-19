package javafx_properties;
import javafx.beans.property.*;

public class OurProperty {
    // start with getters and setters
    private DoubleProperty property;

    public final void setProperty(double property) {
        this.propertyProperty().set(property);
    }

    public final double getProperty() {
        if(property!=null)
        return property.get();
        return 0;
    }

    public final DoubleProperty propertyProperty(){
        if(property == null){
            property = new SimpleDoubleProperty(0);
        }
        return property;
    }
}
