package Base;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	public static String getTD(int rowindex,int colindex) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Ankush\\OneDrive\\Documents\\may7.xlsx");
		org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(fis).getSheet("may7");
		String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		return data;
	}
	
	}

