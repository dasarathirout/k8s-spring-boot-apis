package org.drout.actuator;

import java.lang.management.ManagementFactory;
import java.util.Date;
import java.util.Properties;

class Pulses{
    private String name;
    private Date jvmStartTime;
    private Properties properties;

    public Pulses(String name){
        this.name = name;
        this.properties = System.getProperties();
        this.jvmStartTime = new Date(ManagementFactory.getRuntimeMXBean().getStartTime());
    }
    public String getName() {
        return name;
    }
    public Date getJvmStartTime() {
        return jvmStartTime;
    }
    private Properties getProperties() {
        return properties;
    }
}