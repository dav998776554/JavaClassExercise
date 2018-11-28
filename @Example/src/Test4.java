/*
WARRING PROBLME THAT IS A Function
*/
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory.Default;

@Target({ElementType.METHOD})
public @interface Test4 {
	int timeOut() default 0;
	Class expected() default Default.class;
	class Default{}
	String[] age() default{"Panny,Whites"};
	String message() default "";
}
