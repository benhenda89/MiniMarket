package com.minimarket.core.domain;

import java.math.BigDecimal;


public interface Product {

	String getProductCode();

	void setProductCode(String productCode);

	String getProductName();

	ProductLine getProductLine();

	void setProductName(String productName);

	void setProductLine(ProductLine productLine);

	ProductScale getProductScale();

	void setProductScale(ProductScale productScale);

	Vendor getProductVendor();

	void setProductVendor(Vendor productVendor);

	String getProductDescription();

	void setProductDescription(String productDescription);

	String getQuantityInStock();

	void setQuantityInStock(String quantityInStock);

	BigDecimal getBuyPrice();

	void setBuyPrice(BigDecimal buyPrice);

	String getMSRP();

	void setMSRP(String mSRP);
	
	
}
