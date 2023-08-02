package SpringbootDemo.SpringDemoClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
@Component
@Primary
public class Serviceclass 
{
private Componentclass o;
@Autowired
public Serviceclass(Componentclass o)
{
this.o=o;	
}
public void meth()
{
	System.out.println("output for service class");
	o.method();
}
}
