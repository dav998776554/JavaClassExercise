import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Demo {
	public static void main(String[] args)throws NoSuchMethodException {
		Class<Other> c = Other.class;
		Method method = c.getMethod("doOther");
		if(method.isAnnotationPresent(Debug.class)) {
			System.out.println("�w�]�w @Debug �е�");
			//���o@Debug���
			Debug debug = method.getAnnotation(Debug.class);
			System.out.printf("value : %s%n",debug.value());
			System.out.printf("name : %s%n",debug.name());
		}else {
			System.out.println("�S���]�w@Debug�е�");
		}
		Annotation[] anno  = method.getAnnotations();
		for(Annotation annos : anno) {
			System.out.println(annos.annotationType().getName());
		}
	}
}
