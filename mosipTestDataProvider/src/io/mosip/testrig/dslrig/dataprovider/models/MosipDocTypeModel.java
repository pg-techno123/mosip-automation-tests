package io.mosip.testrig.dslrig.dataprovider.models;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MosipDocTypeModel  implements Serializable{
	private static final Logger logger = LoggerFactory.getLogger(MosipDocTypeModel.class);

	 private static final long serialVersionUID = 1L;
	String code;
	String createdBy;
	Boolean isActive;
	Boolean isDeleted;
	String langCode;
	String name;
	String updatedBy;
	
	String createdDateTime;
	String updatedDateTime;
	String deletedDateTime;
	
	String docTypeCode;
	String docCategoryCode;
	String docTypeName;
	public String getDocTypeCode() {
		return docTypeCode;
	}
	public void setDocTypeCode(String docTypeCode) {
		this.docTypeCode = docTypeCode;
	}
	public String getDocCategoryCode() {
		return docCategoryCode;
	}
	public void setDocCategoryCode(String docCategoryCode) {
		this.docCategoryCode = docCategoryCode;
	}
	public String getDocTypeName() {
		return docTypeName;
	}
	public void setDocTypeName(String docTypeName) {
		this.docTypeName = docTypeName;
	}
	
	
	
	public String getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public String getUpdatedDateTime() {
		return updatedDateTime;
	}
	public void setUpdatedDateTime(String updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}
	public String getDeletedDateTime() {
		return deletedDateTime;
	}
	public void setDeletedDateTime(String deletedDateTime) {
		this.deletedDateTime = deletedDateTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	String description;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getLangCode() {
		return langCode;
	}
	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String toJSONString() {
		
		ObjectMapper Obj = new ObjectMapper();
		String jsonStr ="";
		try {
				jsonStr = Obj.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			logger.error(e.getMessage());
		}	
		return jsonStr;
	}
}
