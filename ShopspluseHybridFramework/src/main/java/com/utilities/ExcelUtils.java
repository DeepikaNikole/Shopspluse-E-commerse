package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

    private Workbook workbook;
    private Sheet sheet;

    public ExcelUtils(String filePath, String sheetName) throws IOException, InvalidFormatException {
        FileInputStream fis = new FileInputStream(filePath);
        workbook = WorkbookFactory.create(fis);

        // Ensure the sheet exists
        sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
            throw new IllegalArgumentException("Sheet named '" + sheetName + "' does not exist in the Excel file.");
        }
    }

    public String getCellData(int rowNumber, int cellNumber) {
        // Ensure the row is not null
        Row row = sheet.getRow(rowNumber);
        if (row == null) {
            throw new IllegalArgumentException("Row " + rowNumber + " does not exist in the sheet.");
        }

        // Return cell data as string
        return row.getCell(cellNumber).toString();
    }

    public int getRowCount() {
        return sheet.getLastRowNum();
    }

    public void closeWorkbook() throws IOException {
        workbook.close();
    }
}
