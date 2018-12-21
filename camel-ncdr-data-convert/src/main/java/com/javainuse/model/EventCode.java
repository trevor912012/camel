package com.javainuse.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "eventcode")
@XmlAccessorType(XmlAccessType.FIELD)
public class EventCode {

	private String valueName;

    private String value;

    public String getValueName ()
    {
        return valueName;
    }

    public void setValueName (String valueName)
    {
        this.valueName = valueName;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [valueName = "+valueName+", value = "+value+"]";
    }
}
