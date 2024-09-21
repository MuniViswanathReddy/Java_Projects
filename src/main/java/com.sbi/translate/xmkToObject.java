package com.sbi.translate;

import modal.AccountInfo;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class xmkToObject {
    public static void main(String[] args) throws JAXBException {
       JAXBContext jaxbContext= JAXBContext.newInstance(AccountInfo.class);
       Unmarshaller unmarshaller =jaxbContext.createUnmarshaller();
       AccountInfo accountInfo=(AccountInfo) unmarshaller.unmarshal(new File("C:\\Users\\muniv\\xml_file.txt"));
       System.out.println(accountInfo);
    }
}
