package com.xworkz.project.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.project.entity.ProjectEntity;
import com.xworkz.singleton.util.SFUtil;

public class ProjectDAOImpl implements ProjectDAO {
	private SessionFactory factory = SFUtil.getFactory();

	public ProjectDAOImpl() {
		System.out.println("created" + this.getClass());
	}

	@Override
	public void create(ProjectEntity entity) {
		System.out.println("create method ");
		System.out.println("entity is" + entity);
		try (Session session = factory.openSession()) {
			Transaction tr = session.beginTransaction();
			session.save(entity);
			session.flush();
			tr.commit();
		}
	}
}
