package com.sbi;

import com.fasterxml.jackson.databind.ObjectMapper;
import modal.AccountInfo;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.ext.MessageBodyReader;
import jakarta.ws.rs.ext.Provider;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
public class AccountsInfoMessageBodyJsonReader implements MessageBodyReader<AccountInfo> {
    @Override
    public boolean isReadable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return true;
    }

    @Override
    public AccountInfo readFrom(Class<AccountInfo> aClass, Type type, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, String> multivaluedMap, InputStream inputStream) throws IOException, WebApplicationException {
        ObjectMapper mapper = new ObjectMapper();
        AccountInfo accountInfo=mapper.readValue(inputStream, AccountInfo.class);
        return accountInfo;
    }
}
