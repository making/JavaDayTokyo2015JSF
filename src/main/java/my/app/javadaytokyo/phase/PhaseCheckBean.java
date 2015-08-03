package my.app.javadaytokyo.phase;

import org.springframework.context.annotation.Scope;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 * JSFのフェーズ確認.
 * 
 * @author kikuta
 */
@Named(value = "phaseCheckBean")
//@ViewScoped // TODO View scope is not used with Spring.
@Scope("session")
public class PhaseCheckBean implements Serializable{

    private String str;

    public String getStr() {
        System.out.println("Getter");
        return str;
    }

    public void setStr(String str) {
        System.out.println("Setter");
        this.str = str;
    }
    
    @PostConstruct
    public void init(){
        System.out.println("管理Bean初期化");
    }
    
    static{
        System.out.println("Static初期化");
    }
    
    public void callFromActionListener(){
        System.out.println("ActionLisetenerから呼び出し");
    }
    
    public void callFromAction(){
        System.out.println("Actionから呼び出し");
    }
}
