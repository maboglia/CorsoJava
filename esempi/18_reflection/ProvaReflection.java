package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import model.CapoAbbigliamento;
import model.Pantalone;
import model.Taglia;

public class ProvaReflection {

	public static void main(String[] args) {
		
		CapoAbbigliamento capo = new CapoAbbigliamento() {
		};
		
		Class<? extends CapoAbbigliamento> class1 = capo.getClass();
		
		Pantalone p = new Pantalone("jeans blu", Taglia.L);
		
		Class<? extends Pantalone> class2 = p.getClass();
		
		System.out.println(class2.getName());
		System.out.println(class2.getSimpleName());
		
		try {
			Class<?> pant = Class.forName(class2.getName());
			Method[] methods = pant.getMethods();
			
			for (Method method : methods) {
				System.out.println(method.getName());
			}
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Constructor<?>[] constructors = class2.getConstructors();
		System.out.println("costruttori: " + constructors.length);
		
		 Constructor<?> constr =   constructors[0];
		
		 Object obj = null;
		 
		 try {
			obj = constr.newInstance("jeans blu", Taglia.L);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
