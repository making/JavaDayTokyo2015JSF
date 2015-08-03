package my.app.javadaytokyo.primefaces;

import java.util.stream.IntStream;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author kikuta
 */
@Named(value = "primeFacesModernBean")
@Scope("request")
public class PrimeFacesModernBean {
    
    @Getter @Setter
    private String input;
    
    public void submit(){
        
    }

    public void block(){
        IntStream.range(0, 50000).forEach(System.out::println);
    }
    
}
