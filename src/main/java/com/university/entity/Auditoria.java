package com.university.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * The persistent class for the auditoria database table.
 * 
 */
@Entity
@Table(name = "auditoria")
public class Auditoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "addressIP", nullable = false, length = 70)
	private String addressIP;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate", nullable = false, length = 19)
	private Date createDate;
	@Column(name = "operationCrud", nullable = false, length = 1)
	private String operationCrud;
	@Column(name = "tableId", nullable = false)
	private int tableId;
	@Column(name = "tableName", nullable = false, length = 30)
	private String tableName;
	@Column(name = "userId", nullable = false, length = 8)
	private String userId;

	public Auditoria() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressIP() {
		return this.addressIP;
	}

	public void setAddressIP(String addressIP) {
		this.addressIP = addressIP;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getOperationCrud() {
		return this.operationCrud;
	}

	public void setOperationCrud(String operationCrud) {
		this.operationCrud = operationCrud;
	}

	public int getTableId() {
		return this.tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}