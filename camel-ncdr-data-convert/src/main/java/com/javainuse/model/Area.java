package com.javainuse.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "area")
@XmlAccessorType(XmlAccessType.FIELD)
public class Area {

	private Geocode geocode;

    private String areaDesc;

    public Geocode getGeocode ()
    {
        return geocode;
    }

    public void setGeocode (Geocode geocode)
    {
        this.geocode = geocode;
    }

    public String getAreaDesc ()
    {
        return areaDesc;
    }

    public void setAreaDesc (String areaDesc)
    {
        this.areaDesc = areaDesc;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [geocode = "+geocode+", areaDesc = "+areaDesc+"]";
    }
  }
