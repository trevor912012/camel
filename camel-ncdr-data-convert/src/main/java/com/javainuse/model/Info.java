package com.javainuse.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "info")
@XmlAccessorType(XmlAccessType.FIELD)
public class Info {

	private String headline;

    private String certainty;

    private String web;

    private String severity;

    private String effective;

    private String urgency;

    private String category;

    private Area[] area;

    private Parameter[] parameter;

    private String expires;

    private String senderName;

    private String event;

    private String description;

    private String responseType;

    private EventCode eventCode;

    private String instruction;

    private String language;

    public String getHeadline ()
    {
        return headline;
    }

    public void setHeadline (String headline)
    {
        this.headline = headline;
    }

    public String getCertainty ()
    {
        return certainty;
    }

    public void setCertainty (String certainty)
    {
        this.certainty = certainty;
    }

    public String getWeb ()
    {
        return web;
    }

    public void setWeb (String web)
    {
        this.web = web;
    }

    public String getSeverity ()
    {
        return severity;
    }

    public void setSeverity (String severity)
    {
        this.severity = severity;
    }

    public String getEffective ()
    {
        return effective;
    }

    public void setEffective (String effective)
    {
        this.effective = effective;
    }

    public String getUrgency ()
    {
        return urgency;
    }

    public void setUrgency (String urgency)
    {
        this.urgency = urgency;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public Area[] getArea ()
    {
        return area;
    }

    public void setArea (Area[] area)
    {
        this.area = area;
    }

    public Parameter[] getParameter ()
    {
        return parameter;
    }

    public void setParameter (Parameter[] parameter)
    {
        this.parameter = parameter;
    }

    public String getExpires ()
    {
        return expires;
    }

    public void setExpires (String expires)
    {
        this.expires = expires;
    }

    public String getSenderName ()
    {
        return senderName;
    }

    public void setSenderName (String senderName)
    {
        this.senderName = senderName;
    }

    public String getEvent ()
    {
        return event;
    }

    public void setEvent (String event)
    {
        this.event = event;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getResponseType ()
    {
        return responseType;
    }

    public void setResponseType (String responseType)
    {
        this.responseType = responseType;
    }

    public EventCode getEventCode ()
    {
        return eventCode;
    }

    public void setEventCode (EventCode eventCode)
    {
        this.eventCode = eventCode;
    }

    public String getInstruction ()
    {
        return instruction;
    }

    public void setInstruction (String instruction)
    {
        this.instruction = instruction;
    }

    public String getLanguage ()
    {
        return language;
    }

    public void setLanguage (String language)
    {
        this.language = language;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [headline = "+headline+", certainty = "+certainty+", web = "+web+", severity = "+severity+", effective = "+effective+", urgency = "+urgency+", category = "+category+", area = "+area+", parameter = "+parameter+", expires = "+expires+", senderName = "+senderName+", event = "+event+", description = "+description+", responseType = "+responseType+", eventCode = "+eventCode+", instruction = "+instruction+", language = "+language+"]";
    }  
}
