package my.app.javadaytokyo.scope;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author kikuta
 */
@Named(value = "viewScopeBean")
//@ViewScoped // TODO View scope is not used with Spring.
@Scope("session")
public class ViewScopeBean implements Serializable{

    @Getter @Setter
    private int count;
    
    public void countup(){
        count++;
    }
}
