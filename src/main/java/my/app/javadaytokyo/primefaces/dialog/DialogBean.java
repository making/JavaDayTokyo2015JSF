package my.app.javadaytokyo.primefaces.dialog;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.context.RequestContext;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author kikuta
 */
@Named(value = "dialogBean")
//@ViewScoped // TODO View scope is not used with Spring.
@Scope("session")
public class DialogBean implements Serializable{
    
    @Getter @Setter
    private String inputDialog;
    
    @Getter
    private List<String> param;

    @PostConstruct
    public void initDialog(){
        System.out.println("ダイアログ表示");
        String[] list = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterValuesMap().get("nogizaka");
        param = Arrays.stream(list).collect(Collectors.toList());
    }
    
    public void closeDialog(){
        RequestContext.getCurrentInstance().closeDialog(inputDialog);
    }
}
