package com.sbi;

import modal.AccountInfo;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.ext.MessageBodyReader;
import jakarta.ws.rs.ext.Provider;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

@Provider
@Consumes(MediaType.APPLICATION_XML)
public class AccountsInfoMessageBodyXmlReader implements MessageBodyReader<AccountInfo> {
    @Override
    public boolean isReadable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return true;
    }

    @Override
    public AccountInfo readFrom(Class<AccountInfo> aClass, Type type, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, String> multivaluedMap, InputStream inputStream) throws IOException, WebApplicationException {
        try {
            JAXBContext jaxbContext=JAXBContext.newInstance(AccountInfo.class);
            Unmarshaller unmarshaller =jaxbContext.createUnmarshaller();
            AccountInfo accountInfo=(AccountInfo) unmarshaller.unmarshal(inputStream);
            return accountInfo;
        } catch (Exception e) {
            throw new WebApplicationException(e);
        }
    }
}
