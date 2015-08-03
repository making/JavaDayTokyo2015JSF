package my.app.javadaytokyo.scope;

import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author kikuta
 */
@Named(value = "requestScopeBean")
@Scope("request")
public class RequestScopeBean {

    @Getter @Setter
    private int count;
    
    public void countup(){
        count++;
    }
}
