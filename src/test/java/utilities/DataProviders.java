package utilities;
 
//import java.io.FileInputStream;

import java.io.IOException;
 
import org.testng.annotations.DataProvider;
 
public class DataProviders {

	@DataProvider(name="DP1")

	public String[][] data() throws IOException

	{

		ExcelUtils excelUtil=new ExcelUtils();
		int rowCount=1;
		int cellCount=excelUtil.getLastCellNum();
		String [][] s=new String[rowCount][cellCount];
		for(int i=0;i<cellCount;i++)
		{
			s[rowCount - 1][i] = excelUtil.getCellData(rowCount, i);
		}
		return s;

	}
 
}

 