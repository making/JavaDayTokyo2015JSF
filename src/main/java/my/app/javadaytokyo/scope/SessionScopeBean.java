package my.app.javadaytokyo.scope;

import javax.inject.Named;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author kikuta
 */
@Named(value = "sessionScopeBean")
@Scope("session")
public class SessionScopeBean implements Serializable {

    @Getter @Setter
    private int count;
    
    public void countup(){
        count++;
    }
}
