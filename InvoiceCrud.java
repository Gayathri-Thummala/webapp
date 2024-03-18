package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.pojo.InvoicePojo;

public class InvoiceCrud {
	
	public Connection getConnection() {
		Connection con = null;
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String DBname = "my_db";
		String username = "root";
		String password = "root";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url + DBname, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public ArrayList<InvoicePojo> getInvoices() {
		ArrayList<InvoicePojo> AllInvoices = new ArrayList<>();
		String business_code, cust_number, name_customer, clear_date, posting_date,
		due_in_date, baseline_create_date, cust_payment_terms, aging_bucket;
		int business_year;
		long doc_id;
		float converted_usd;
		
		try {
			Connection con = getConnection();
			String sql_query = "Select * FROM final_dataset";
			PreparedStatement pstmt = con.prepareStatement(sql_query);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				business_code = rs.getString("business_code");
				cust_number = rs.getString("cust_number");
				name_customer = rs.getString("name_customer");
				clear_date = rs.getString("clear_date");
				business_year = rs.getInt("buisness_year");
				doc_id = rs.getLong("doc_id");
				posting_date = rs.getString("posting_date");
				due_in_date = rs.getString("due_in_date");
				baseline_create_date = rs.getString("baseline_create_date");
				cust_payment_terms = rs.getString("cust_payment_terms");
				converted_usd = rs.getFloat("converted_usd");
				aging_bucket = rs.getString("aging_bucket");
				
				InvoicePojo invoice = new InvoicePojo();
				invoice.setBusiness_code(business_code);
				invoice.setCust_number(cust_number);
				invoice.setName_customer(name_customer);
				invoice.setClear_date(clear_date);
				invoice.setBusiness_year(business_year);
				invoice.setDoc_id(doc_id);
				invoice.setPosting_date(posting_date);
				invoice.setDue_in_date(due_in_date);
				invoice.setBaseline_create_date(baseline_create_date);
				invoice.setCust_payment_terms(cust_payment_terms);
				invoice.setConverted_usd(converted_usd);
				invoice.setAging_bucket(aging_bucket);

				AllInvoices.add(invoice);
			}
			
			for (InvoicePojo invoice: AllInvoices) {
				System.out.println(invoice.toString());
			}
			System.out.println(AllInvoices.size());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occurred!");
		}
		
		return AllInvoices;
	}

}
