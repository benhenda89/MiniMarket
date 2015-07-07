package com.minimarket.core.domain;

import java.math.BigDecimal;

public class ProductImpl extends MiniMarketAbstractUtils implements Product{
	
	private String  			productCode;
	private String  			productName;
	private ProductLine  		productLine;
	private ProductScale  		productScale;
	private Vendor  			productVendor;
	private String  			productDescription;
	private String  			quantityInStock;
	private BigDecimal  		buyPrice;
	private String  			MSRP;
	
	@Override
	public String getProductCode() {
		return productCode;
	}
	
	@Override
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	@Override
	public String getProductName() {
		return productName;
	}
	
	@Override
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Override
	public ProductLine getProductLine() {
		return productLine;
	}
	
	@Override
	public void setProductLine(ProductLine productLine) {
		this.productLine = productLine;
	}
	
	@Override
	public ProductScale getProductScale() {
		return productScale;
	}
	
	@Override
	public void setProductScale(ProductScale productScale) {
		this.productScale = productScale;
	}
	
	@Override
	public Vendor getProductVendor() {
		return productVendor;
	}
	
	@Override
	public void setProductVendor(Vendor productVendor) {
		this.productVendor = productVendor;
	}
	
	@Override
	public String getProductDescription() {
		return productDescription;
	}
	
	@Override
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	@Override
	public String getQuantityInStock() {
		return quantityInStock;
	}
	
	@Override
	public void setQuantityInStock(String quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	
	@Override
	public BigDecimal getBuyPrice() {
		return buyPrice;
	}
	
	@Override
	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}
	
	@Override
	public String getMSRP() {
		return MSRP;
	}
	
	@Override
	public void setMSRP(String mSRP) {
		MSRP = mSRP;
	}
	
	
}
