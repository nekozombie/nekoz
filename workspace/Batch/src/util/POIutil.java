package util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.*;

public class POIutil {
	public boolean excelFileSave(String fileName) {
		Workbook wb = new HSSFWorkbook();

		FileOutputStream out = null;
		try {
			out = new FileOutputStream(fileName);
			wb.write(out);
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
		return false;
	}

}
