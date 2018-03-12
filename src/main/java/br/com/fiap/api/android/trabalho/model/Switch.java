package br.com.fiap.api.android.trabalho.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Switch {

	@Id
	private String id;
	private Long switchValue;
	private Date creationDate;
	
	public Switch() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getSwitchValue() {
		return switchValue;
	}

	public void setSwitchValue(Long switchValue) {
		this.switchValue = switchValue;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
