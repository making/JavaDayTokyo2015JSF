package my.app.javadaytokyo.omnifaces;

import javax.inject.Named;
import javax.faces.context.FacesContext;
//import org.omnifaces.util.Faces;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author kikuta
 */
@Named(value = "omniFacesBean")
@Scope("request")
public class OmniFacesBean {

    public void exampleNormal(){
        if(FacesContext.getCurrentInstance() != null){
            String usingTheme = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("primefaces.THEME");
            System.out.println(usingTheme);
        }
    }
    
    public void exampleUsingOmniFaces(){
//        if(Faces.hasContext()){
//            String usingTheme = Faces.getInitParameter("primefaces.THEME");
//            System.out.println(usingTheme);
//        }
    }
}
