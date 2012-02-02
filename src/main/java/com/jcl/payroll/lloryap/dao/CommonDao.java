package com.jcl.payroll.lloryap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jcl.payroll.lloryap.model.Department;
import com.jcl.payroll.lloryap.model.Position;
import com.jcl.payroll.lloryap.model.TransactionType;

@Repository
public class CommonDao {

	@PersistenceContext
	private EntityManager entityManager;

	// Department
	public Department findDepartment(Long id) {
		return entityManager.find(Department.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Department> getAllDepartments() {
		return (List<Department>) entityManager.createQuery("from Department").getResultList();
	}

	@Transactional
	public Department save(Department department) {
		if (department.getId() == null) {
			entityManager.persist(department);
		} else {
			entityManager.merge(department);
		}

		return department;
	}

	// JobPosition
	public Position findJobPosition(Long id) {
		return entityManager.find(Position.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Position> getAllPositions() {
		return (List<Position>) entityManager.createQuery("from Position").getResultList();
	}

	@Transactional
	public Position save(Position position) {
		if (position.getId() == null) {
			entityManager.persist(position);
		} else {
			entityManager.merge(position);
		}

		return position;
	}

	// TransactionType
	public TransactionType findTransactionType(Long id) {
		return entityManager.find(TransactionType.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<TransactionType> getAllTransactionType() {
		return (List<TransactionType>) entityManager.createQuery("from TransactionType").getResultList();
	}

	@Transactional
	public TransactionType save(TransactionType transactionType) {
		if (transactionType.getId() == null) {
			entityManager.persist(transactionType);
		} else {
			entityManager.merge(transactionType);
		}

		return transactionType;
	}
}
