package TestCases;

import org.testng.annotations.Test;

import Libraries.ExcelReadAndWrite;

public class TC002 {

	@Test
	public void TestUserNameExcel() throws Exception {
		ExcelReadAndWrite xl = new ExcelReadAndWrite();
		xl.getRows();
		for(int i=0; i<= xl.getRows(); i++) {
			xl.getColumns(xl.getRows());
			for(int j=0; j <= xl.getColumns(xl.getRows())-1; j++) {
				xl.readData(i, j);
				System.out.println(xl.readData(i, j) + " ");
			}
		}
		xl.writeData(0, 2, "Flight name");
		xl.writeData(1, 2, "American Airlines");
		System.out.println();
	}	
}
