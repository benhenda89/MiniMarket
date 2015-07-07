package com.minimarket.core.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.broadleafcommerce.common.persistence.EntityConfiguration;

import com.minimarket.core.domain.Media;
import com.minimarket.core.domain.MediaImpl;

public class MediaDaoImpl implements MediaDao{
	
	@PersistenceContext(unitName = "atPu")
	protected EntityManager em;
	
	@Resource(name="blEntityConfiguration")
    protected EntityConfiguration entityConfiguration;
	
	@Override
	public Media create() {
		return (Media) entityConfiguration.createEntityInstance(Media.class.getName());
	}

	@Override
	public Media saveMedia(Media media) {
		return em.merge(media);
	}

	@Override
	public void deleteMedia(Media media) {
		em.remove(media);
	}

	@Override
	public Media readMediaById(Long mediaId) {
		return em.find(MediaImpl.class, mediaId);
	}

	@Override
	public List<Media> readAllMedia() {
		TypedQuery<Media> query = em.createNamedQuery("READ_ALL_MEDIA",Media.class);
		final List<Media> tmp = query.getResultList();
		if(!CollectionUtils.isEmpty(tmp)){
			return tmp;
		}
		return null;
	}

}
