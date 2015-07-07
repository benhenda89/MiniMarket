package com.minimarket.core.dao;

import java.util.List;

import com.minimarket.core.domain.Media;

public interface MediaDao {
	
	public Media create();
	
	public Media saveMedia(Media media);
	
	public void deleteMedia(Media media);
	
	public Media readMediaById(Long mediaId);
	
	public List<Media> readAllMedia();
}
