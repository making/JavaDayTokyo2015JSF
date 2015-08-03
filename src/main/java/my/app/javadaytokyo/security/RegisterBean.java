package my.app.javadaytokyo.security;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author kikuta
 */
@Named(value = "registerBean")
//@ViewScoped // TODO View scope is not used with Spring.
@Scope("session")
public class RegisterBean implements Serializable{

    @Getter @Setter
    private String userName;
    
    @PostConstruct
    public void inti(){
        userName = "default";
    }
}
