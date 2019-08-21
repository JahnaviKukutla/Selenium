package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("src\\PropertyFile\\Credentials.properties"));
		System.out.println(prop.getProperty("url"));
		/*Searches for the property with the specified key in this property list.
		 * If the key is not found in this property list, the default property list,
		 * and its defaults, recursively, are then checked. The method returns
		 * {@code null} if the property is not found.*/
	}
}
