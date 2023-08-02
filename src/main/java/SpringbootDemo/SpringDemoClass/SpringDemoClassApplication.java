package SpringbootDemo.SpringDemoClass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoClassApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringDemoClassApplication.class, args);
		ConfigurableApplicationContext con=SpringApplication.run(SpringDemoClassApplication.class, args);
		Componentclass cc  =(Componentclass) con.getBean(Componentclass.class);
	    Serviceclass sc =con.getBean(Serviceclass.class);
	    cc.method();
	    sc.meth();
	    
	}

}
