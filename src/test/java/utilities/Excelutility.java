package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility 
{
	public   FileInputStream fi;
	public  FileOutputStream fo;
	public   XSSFWorkbook wb;
	public   XSSFSheet sh;
	public  XSSFRow row;
	public  XSSFCell cell;
	 String path;
	
	
	public Excelutility(String path)
	{
		this.path=path;
	}
	
	public int  getrow(String xlsheet) throws Exception
	{
		fi= new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(xlsheet);
		int rownum=sh.getLastRowNum();
		wb.close();
		fi.close();
		return rownum;
	}
	public  int getcell(String xlsheet,int rownum) throws Exception
	{
		fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(xlsheet);
        row=sh.getRow(rownum);
        int cellnum=row.getLastCellNum();
        wb.close();
        fi.close();
		return cellnum;
	}
	public  String getcelldata(String xlsheet,int rownum,int cellnum) throws Exception
	{
		fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(xlsheet);
		row=sh.getRow(rownum);
		cell=row.getCell(cellnum);
		
		
		String data;
		try {
			
			//data=cell.toString();
			DataFormatter formater=new DataFormatter();
			data=formater.formatCellValue(cell);
			
			
		} catch (Exception e) 
		{
			data="";
		}
		
        wb.close();
        fi.close();
        
		return data;
		
	}

}
