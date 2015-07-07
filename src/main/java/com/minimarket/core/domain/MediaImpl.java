package com.minimarket.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="MEDIA")
@Inheritance(strategy = InheritanceType.JOINED)
public class MediaImpl extends MiniMarketAbstractUtils implements Media{
	
	@Id
	@Column(name="MEDIA_ID" , nullable=false , length = MAX_ID_LENTH)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mediaId;
	
	@Column(name="IMAGE_URL" , nullable = false)
	private String imageUrl;
	
	@Override
	public Long getMediaId() {
		// TODO Auto-generated method stub
		return mediaId;
	}

	@Override
	public void setMediaId(Long mediaId) {
		// TODO Auto-generated method stub
		this.mediaId=mediaId;
	}

	@Override
	public String getImageUrl() {
		// TODO Auto-generated method stub
		return imageUrl;
	}

	@Override
	public void setImageUrl(String imageUrl) {
		// TODO Auto-generated method stub
		this.imageUrl=imageUrl;
	}

}
