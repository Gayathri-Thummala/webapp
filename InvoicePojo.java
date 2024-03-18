package com.pojo;

public class InvoicePojo {
	
	private String business_code, cust_number, name_customer, clear_date, posting_date,
					due_in_date, baseline_create_date, cust_payment_terms, aging_bucket;
	private int business_year;
	private long doc_id;
	private float converted_usd;
	
	public String getBusiness_code() {
		return business_code;
	}
	public void setBusiness_code(String business_code) {
		this.business_code = business_code;
	}
	public String getCust_number() {
		return cust_number;
	}
	public void setCust_number(String cust_number) {
		this.cust_number = cust_number;
	}
	public String getName_customer() {
		return name_customer;
	}
	public void setName_customer(String name_customer) {
		this.name_customer = name_customer;
	}
	public String getClear_date() {
		return clear_date;
	}
	public void setClear_date(String clear_date) {
		this.clear_date = clear_date;
	}
	public int getBusiness_year() {
		return business_year;
	}
	public void setBusiness_year(int business_year) {
		this.business_year = business_year;
	}
	public long getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(long doc_id) {
		this.doc_id = doc_id;
	}
	public String getPosting_date() {
		return posting_date;
	}
	public void setPosting_date(String posting_date) {
		this.posting_date = posting_date;
	}
	public String getDue_in_date() {
		return due_in_date;
	}
	public void setDue_in_date(String due_in_date) {
		this.due_in_date = due_in_date;
	}
	public String getBaseline_create_date() {
		return baseline_create_date;
	}
	public void setBaseline_create_date(String baseline_create_date) {
		this.baseline_create_date = baseline_create_date;
	}
	public String getCust_payment_terms() {
		return cust_payment_terms;
	}
	public void setCust_payment_terms(String cust_payment_terms) {
		this.cust_payment_terms = cust_payment_terms;
	}
	public float getConverted_usd() {
		return converted_usd;
	}
	public void setConverted_usd(float converted_usd) {
		this.converted_usd = converted_usd;
	}
	public String getAging_bucket() {
		return aging_bucket;
	}
	public void setAging_bucket(String aging_bucket) {
		this.aging_bucket = aging_bucket;
	}
	
	@Override
	public String toString() {
		return "InvoicePojo [business_code=" + business_code + ", cust_number=" + cust_number + ", name_customer="
				+ name_customer + ", clear_date=" + clear_date + ", business_year=" + business_year + ", doc_id="
				+ doc_id + ", posting_date=" + posting_date + ", due_in_date=" + due_in_date + ", baseline_create_date="
				+ baseline_create_date + ", cust_payment_terms=" + cust_payment_terms + ", converted_usd="
				+ converted_usd + ", aging_bucket=" + aging_bucket + "]";
	}

}
