package com.mkdika.zkmvvmcrudhbjpa.helper;

import com.mkdika.zkmvvmcrudhbjpa.service.AppService;
import org.zkoss.zkplus.spring.SpringUtil;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class AppUtil {
    
    private static AppService appService;
        
    
    public static AppService svc() {
        if (appService == null) {
            appService = (AppService) SpringUtil.getBean("appService");
        }
        return appService;
    }      
}
