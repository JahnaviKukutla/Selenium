package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnDemo1 extends AnnotationOrder{
		@Test
		public void s2() {
			Reporter.log("Method from demo1", true);
		}
	}

