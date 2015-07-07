package com.minimarket.core.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_SCALE")
@Inheritance ( strategy  = InheritanceType.JOINED)
public class ProductScaleImpl extends MiniMarketAbstractUtils implements ProductScale{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SCALE_ID")
	protected Long id;
	
	@Column(name = "WIDTH")
	protected BigDecimal width;
	
	@Column(name = "HEIGTH")
	protected BigDecimal heigth;
	
	@Column(name  = "WEIGTH")
	protected BigDecimal weigth;
	
	@OneToOne(targetEntity = ProductImpl.class)
	@JoinColumn(name = "PRODUCT_ID")
	protected Product product;
	
	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public BigDecimal getWidth() {
		return width;
	}

	@Override
	public void setWidth(BigDecimal width) {
		this.width = width;
	}

	@Override
	public BigDecimal getHeight() {
		return heigth;
	}

	@Override
	public void setHeigth(BigDecimal heigth) {
		this.heigth = heigth;
	}

	@Override
	public BigDecimal getWeight() {
		return weigth;
	}

	@Override
	public void setWeight(BigDecimal weight) {
		this.weigth = weight;
	}

	@Override
	public Product getProduct() {
		return product;
	}

	@Override
	public void setProduct(Product product) {
		this.product = product;
	}

}
