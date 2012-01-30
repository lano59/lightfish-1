package org.lightfish.business.monitoring.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: blog.adam-bien.com
 * Date: 30.01.12
 * Time: 19:40
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OneShot {

    private String version;

    public OneShot() {
    }


    public static class Builder{
        private OneShot oneShot;

        public Builder() {
            this.oneShot = new OneShot();
        }
        
        public Builder version(String version){
            this.oneShot.version = version;
            return this;
        }
        public OneShot build(){
            return this.oneShot;
        }
    }
}
