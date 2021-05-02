/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Popsan
 */
@XmlRootElement
public class Result {
    
    private double area;

    /**
     * Get the value of radius
     *
     * @return the value of radius
     */
    public double getArea() {
        return area;
    }

    /**
     * Set the value of radius
     *
     * @param radius new value of radius
     */
    @XmlElement
    public void setArea(double area) {
        this.area = area;
    }

    private double circum;

    /**
     * Get the value of circum
     *
     * @return the value of circum
     */
    public double getCircum() {
        return circum;
    }

    /**
     * Set the value of circum
     *
     * @param circum new value of circum
     */
    @XmlElement
    public void setCircum(double circum) {
        this.circum = circum;
    }

}
