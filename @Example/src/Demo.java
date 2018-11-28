import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Demo {
	public static void main(String[] args)throws NoSuchMethodException {
		Class<Other> c = Other.class;
		Method method = c.getMethod("doOther");
		if(method.isAnnotationPresent(Debug.class)) {
			System.out.println("已設定 @Debug 標註");
			//取得@Debug實例
			Debug debug = method.getAnnotation(Debug.class);
			System.out.printf("value : %s%n",debug.value());
			System.out.printf("name : %s%n",debug.name());
		}else {
			System.out.println("沒有設定@Debug標註");
		}
		Annotation[] anno  = method.getAnnotations();
		for(Annotation annos : anno) {
			System.out.println(annos.annotationType().getName());
		}
	}
}
