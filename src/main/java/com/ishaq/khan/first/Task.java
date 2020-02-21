package com.ishaq.khan.first;

import javax.xml.bind.annotation.XmlRootElement;

//JAX-RS supports an automatic mapping from JAXB annotated class to XML and JSON
@XmlRootElement
public class Task {
    private String summary;
    private String description;
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


}