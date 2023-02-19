package com.laanaoui.context.xml;


import com.laanaoui.Main;
import com.laanaoui.context.ApplicationContext;
import com.laanaoui.context.Bean;
import com.laanaoui.context.Context;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;
import java.util.Map;

public class XMLConfigContext implements ApplicationContext {
    private Context context;
    private Map<String, Object> beans;

    public XMLConfigContext(String configFileName) {
        context = getBeansFromFile(configFileName);
        for(Bean bean : context.getBeans()){

        }
    }

    private Context getBeansFromFile(String configFileName)  {
        Context context;
        try {
            File file= new File(configFileName);
            JAXBContext jaxbContext = JAXBContext.newInstance(Context.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
             context = (Context) jaxbUnmarshaller.unmarshal(file);
            System.out.println(context);

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


        return context;
    }

    @Override
    public <T> T getBean(String id, Class<T> aClass) {
        return null;
    }

    @Override
    public Object getBean(String id) {
        return null;
    }
}
