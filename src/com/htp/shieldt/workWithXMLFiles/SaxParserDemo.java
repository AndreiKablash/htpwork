package com.htp.shieldt.workWithXMLFiles;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxParserDemo {
    public static void main(String[] args) throws Exception {
        SAXParserFactory parserFactor = SAXParserFactory.newInstance();
        SAXParser parser = parserFactor.newSAXParser();
        SAXHandler handler = new SAXHandler();
        parser.parse(
                ClassLoader.getSystemResourceAsStream("com/htp/shieldt/workWithXMLFiles/emloyee.xml"),
                handler);
        //Printing the list of employees obtained from XML
        for (Employee emp : handler.empList) {
            System.out.println(emp);
        }
    }
}

