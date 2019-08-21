package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnDemo2 extends AnnotationOrder{
		@Test
		public void s1() {
			Reporter.log("Method frpm demo2", true);
		}
	}

