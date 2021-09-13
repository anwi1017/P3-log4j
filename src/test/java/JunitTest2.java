import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;

public class JunitTest2 {

    final Logger LOGGER = LogManager.getLogger(JunitTest2.class.getSimpleName());

    @Before
    public void before(){
        PropertyConfigurator.configure("log4j.properties");

    }
    @Test
    public void test1(){

        //System.out.println(JunitTest1.class.getSimpleName());
        LOGGER.debug("this is a debug message");
        LOGGER.info("this is an info message");
        LOGGER.warn("this is a warning message");
        LOGGER.error("this is an error message");
        LOGGER.fatal("this is a fatal message");


    }
}
