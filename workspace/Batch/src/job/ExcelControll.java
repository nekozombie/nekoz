package job;

import util.POIutil;

public class ExcelControll {

	public boolean execute(){
		System.out.println("test");
		new POIutil().excelFileSave("./data/test.xls");
		return true;
	}
}
