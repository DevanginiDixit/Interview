package com.its.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.its.bean.CandidateBean;
import com.its.model.Candidate;

@Repository
public class CandidateDAOImpl implements CandidateDAO {
private SessionFactory sessionFactory;
	@Override
	public Candidate loginCandidate(CandidateBean candidateBean) {
		// TODO Auto-generated method stub
		return (Candidate)sessionFactory.getCurrentSession().get(Candidate.class, candidateBean.getUsername());
	}

}
