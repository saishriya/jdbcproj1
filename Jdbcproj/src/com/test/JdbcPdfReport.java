package com.test;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.xdevapi.Statement;

public class JdbcPdfReport {
	public static void main(String[] args) throws Exception {

		extracted();

	}

	public static void extracted()
			throws ClassNotFoundException, SQLException, DocumentException, FileNotFoundException {
		/* Create Connection objects */
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "Shriya!123");
		System.out.println("Connected to DB");
		java.sql.Statement stmt = conn.createStatement();
		/* Define the SQL query */
		ResultSet query_set = stmt.executeQuery("SELECT ACTOR_ID,FIRST_NAME,LAST_NAME FROM SAKILA.ACTOR");
		/* Step-2: Initialize PDF documents - logical objects */
		//String file_name = "Documents\\pdf_report_from_sql_using_java.pdf";
		Document my_pdf_report = new Document();
		PdfWriter.getInstance(my_pdf_report, new FileOutputStream("pdf_report_from_sql_using_java.pdf"));
		System.out.println("PDF");
		my_pdf_report.open();
		// we have four columns in our table
		PdfPTable my_report_table = new PdfPTable(4);
		// create a cell object
		PdfPCell table_cell;
		System.out.println("Connected to DB");
		while (query_set.next()) {
			String actor_id = query_set.getString("ACTOR_ID");
			table_cell = new PdfPCell(new Phrase(actor_id));
			my_report_table.addCell(table_cell);
			String first_name = query_set.getString("FIRST_NAME");
			table_cell = new PdfPCell(new Phrase(first_name));
			my_report_table.addCell(table_cell);
			String last_name = query_set.getString("LAST_NAME");
			table_cell = new PdfPCell(new Phrase(last_name));
			my_report_table.addCell(table_cell);
		}
		/* Attach report table to PDF */
		my_pdf_report.add(my_report_table);
		my_pdf_report.close();

		/* Close all DB related objects */
		query_set.close();
		stmt.close();
		conn.close();
	}
}
