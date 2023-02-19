package com.laanaoui.context;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlRootElement(name = "bean")
@XmlType(propOrder = { "id", "path" })
public class Bean {

    private String id;

    private String path;
    public Bean() {
    }

    public Bean(String id, String path) {
        this.id = id;
        this.path = path;
    }

    public String getId() {
        return id;
    }

    @XmlAttribute
    public void setId(String id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }
    @XmlAttribute
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "id='" + id + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
