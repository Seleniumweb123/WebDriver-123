package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException 
	{
		File src=new File("C:\\Users\\user\\Desktop\\TestDat.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheetAt(0);
		int rowCnt=ws.getLastRowNum();
		System.out.println(rowCnt);
		for (int i = 0; i < rowCnt+1; i++)
		{
			String data1=ws.getRow(i).getCell(0).getStringCellValue();
			String data2=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(data1+"---"+data2);
		}
		/*String data1=ws.getRow(0).getCell(0).getStringCellValue();
		String data2=ws.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1+"---"+data2);*/

	}

}
