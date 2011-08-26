/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sysmonitor;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import javax.annotation.ManagedBean;

/**
 *
 * @author j0ni
 */
@ManagedBean
public class NewBean {
    
    public long getMemoryUsed(){
    
        MemoryMXBean mem=ManagementFactory.getMemoryMXBean();
        long val = mem.getHeapMemoryUsage().getUsed();
        return val;
    }
    
    public double getCPULoad(){
    
        double cpu = ManagementFactory.getOperatingSystemMXBean().getSystemLoadAverage();
        return cpu;
    }
    
    public long getDiskSpace(){
        
        File hdd = new File("/");
        long dspace = hdd.getTotalSpace();
        return dspace/1024/1024/1024;
    }
    
}
