package com.itwill.shop.order;

import com.itwill.shop.product.Product;

/*
 * 이름     널?       유형         
	------ -------- ---------- 
	OI_NO  NOT NULL NUMBER(10) 
	OI_QTY          NUMBER(10) 
	P_NO            NUMBER(10) 
	O_NO            NUMBER(10) 
 */
public class OrderItem {
	private int oi_no;
	private int oi_qty;
	/******Product포함******/
	private Product product;
	/*******FK********/
	private int o_no;
	
	public OrderItem() {
		
	}

	public OrderItem(int oi_no, int oi_qty, Product product, int o_no) {
		super();
		this.oi_no = oi_no;
		this.oi_qty = oi_qty;
		this.product = product;
		this.o_no = o_no;
	}

	public int getOi_no() {
		return oi_no;
	}

	public void setOi_no(int oi_no) {
		this.oi_no = oi_no;
	}

	public int getOi_qty() {
		return oi_qty;
	}

	public void setOi_qty(int oi_qty) {
		this.oi_qty = oi_qty;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getO_no() {
		return o_no;
	}

	public void setO_no(int o_no) {
		this.o_no = o_no;
	}

	@Override
	public String toString() {
		return "OrderItem [oi_no=" + oi_no + ", oi_qty=" + oi_qty + ", product=" + product + ", o_no=" + o_no + "]\n";
	}
}