package my.app.javadaytokyo.security;

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
@Named(value = "resultBean")
//@ViewScoped // TODO View scope is not used with Spring.
@Scope("session")
public class ResultBean implements Serializable{

    @Getter @Setter
    private String registeredName;

    public void hoge(){
        System.out.println(registeredName);
    }
}
