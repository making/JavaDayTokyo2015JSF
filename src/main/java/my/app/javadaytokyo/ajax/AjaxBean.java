package my.app.javadaytokyo.ajax;

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
@Getter @Setter
@Named(value = "ajaxBean")
//@ViewScoped // TODO View scope is not used with Spring.
@Scope("session")
public class AjaxBean implements Serializable{

    private String message1;
    
    private String message2;

    private String combinedMessage;
    
    public void combine(){
        combinedMessage = message1 + message2;
    }
}
