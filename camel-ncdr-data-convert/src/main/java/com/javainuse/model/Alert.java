package com.javainuse.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="alert", namespace="urn:oasis:names:tc:emergency:cap:1.2")
@XmlAccessorType(XmlAccessType.FIELD)
public class Alert {

	private String sender;

    private String sent;

    private String scope;

    private String status;

    private String msgType;
    
    private String code;

    private String identifier;

    private Info[] info;

    public String getSender ()
    {
        return sender;
    }

    public void setSender (String sender)
    {
        this.sender = sender;
    }

    public String getSent ()
    {
        return sent;
    }

    public void setSent (String sent)
    {
        this.sent = sent;
    }

    public String getScope ()
    {
        return scope;
    }

    public void setScope (String scope)
    {
        this.scope = scope;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getMsgType ()
    {
        return msgType;
    }

    public void setMsgType (String msgType)
    {
        this.msgType = msgType;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public String getIdentifier ()
    {
        return identifier;
    }

    public void setIdentifier (String identifier)
    {
        this.identifier = identifier;
    }

    public Info[] getInfo ()
    {
        return info;
    }

    public void setInfo (Info[] info)
    {
        this.info = info;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [sender = "+sender+", sent = "+sent+", scope = "+scope+", status = "+status+", msgType = "+msgType+", code = "+code+", identifier = "+identifier+", info = "+info+"]";
    }
}
