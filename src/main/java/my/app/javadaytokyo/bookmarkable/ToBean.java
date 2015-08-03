package my.app.javadaytokyo.bookmarkable;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.context.FacesContext;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author kikuta
 */
@Named(value = "toBean")
@Scope("request")
public class ToBean {

    @Getter @Setter
    private String param1;
    
    @Getter @Setter
    private String param2;
    
    @Getter
    private String actionResult;
    
    @Getter
    private String preRenderViewResult;
    
    @PostConstruct
    public void init(){
        System.out.println("PostConstruct");
    }
    
    public void action(){
        actionResult = param1 + param2 + ":" + FacesContext.getCurrentInstance().getCurrentPhaseId().getName();
    }
    
    public void preRenderView(){
        preRenderViewResult = param1 + param2 + ":" + FacesContext.getCurrentInstance().getCurrentPhaseId().getName();
    }
}
