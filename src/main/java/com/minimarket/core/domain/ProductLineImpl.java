package com.minimarket.core.domain;

import javax.persistence.CascadeType;
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
@Table(name="PRODUCT_LINE")
@Inheritance(strategy = InheritanceType.JOINED)
public class ProductLineImpl extends MiniMarketAbstractUtils implements ProductLine{
	
	@Id
	@Column(name="PRODUCT_LINE_ID" , nullable = false , length = MAX_ID_LENTH)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private 	String 		productLine;
	
	@Column(name="TEXT_DESCRIPTION" , nullable = false , length = MAX_TEXT_LENTGH)
	private 	String   	textDescription;
	
	@Column(name = "HTML_DESCRIPTION")
	private 	String   	htmlDescription;
	
	@OneToOne(targetEntity = MediaImpl.class , cascade = {CascadeType.ALL})
	@JoinColumn(name="MEDIA_ID")
	private 	Media   	media;
	
	@Override
	public String getProductLine() {
		return productLine;
	}
	
	@Override
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}
	
	@Override
	public String getTextDescription() {
		return textDescription;
	}
	
	@Override
	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}
	
	@Override
	public String getHtmlDescription() {
		return htmlDescription;
	}
	
	@Override
	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}
	
	@Override
	public Media getMedia() {
		return media;
	}
	
	@Override
	public void setMedia(Media media) {
		this.media = media;
	}
	
	
}
