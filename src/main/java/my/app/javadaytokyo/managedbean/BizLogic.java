package my.app.javadaytokyo.managedbean;

import org.springframework.stereotype.Service;

/**
 * EJB
 * 
 * @author kikuta
 */
@Service
public class BizLogic {
    
    public String execBizLogic(){
        return "EJBでビジネスロジック実行";
    }
}
