package genericLiab;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertyFile implements autoConstant {

	
	public String getPropertyData(String key) throws IOException
	{
		Properties p= new Properties();
		FileInputStream fis=new FileInputStream(propertyFilepath);
		p.load(fis);
		return p.getProperty(key);
	}
}
