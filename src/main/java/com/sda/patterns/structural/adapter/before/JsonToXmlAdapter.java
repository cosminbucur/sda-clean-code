package com.sda.patterns.structural.adapter.before;

public class JsonToXmlAdapter implements IDataAdapter {
    // It contains an instance of an Adaptee
    private Json json;

    public JsonToXmlAdapter(Json json) {
        this.json = json;
    }

    public Xml convert(Json json) {
        // Logic to convert Json to Xml
        this.json.convertToXML();
        return new Xml();
    }
}
