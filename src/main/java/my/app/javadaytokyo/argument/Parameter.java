package my.app.javadaytokyo.argument;

import javax.inject.Named;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author kikuta
 */
@Named(value = "parameter")
@Scope("session")
public class Parameter implements Serializable {

    @Getter @Setter
    private String value;
}
