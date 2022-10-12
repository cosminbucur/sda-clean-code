package com.sda.patterns.structural.adapter.before;

public class DemoAdapter {

    public static void main(String[] args) {

        Json json = new Json("some json data");
        IDataAdapter adapter = new JsonToXmlAdapter(json);
        Xml xml = adapter.convert(null);
        calculateTax(xml);
    }

    private static int calculateTax(Xml xml) {
        // calculation logic
        int result = 10;
        System.out.println(result);
        return result;
    }
}
