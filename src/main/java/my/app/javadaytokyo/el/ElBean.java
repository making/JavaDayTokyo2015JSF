package my.app.javadaytokyo.el;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
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
@Named(value = "elBean")
//@ViewScoped // TODO View scope is not used with Spring.
@Scope("session")
public class ElBean implements Serializable{

    @Getter @Setter
    private List<String> listName;
    
    @Getter @Setter
    private boolean check;
    
    @PostConstruct
    public void init(){
        listName = Arrays.asList("MaiShiraishi", "NanaseNishino", "MaiFukagawa");
    }
}
