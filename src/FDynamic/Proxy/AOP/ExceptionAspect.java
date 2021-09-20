package FDynamic.Proxy.AOP;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * ExceptionAspect是一个切面，负责ServiceB的异常切面
 */
@Aspect({ ServiceB.class })
public class ExceptionAspect {
	public static void exception(Object object,
			Method method, Object[] args, Throwable e) {
		System.err.println("exception when calling: " + method.getName() 
		+ "," + Arrays.toString(args));
	}
}
