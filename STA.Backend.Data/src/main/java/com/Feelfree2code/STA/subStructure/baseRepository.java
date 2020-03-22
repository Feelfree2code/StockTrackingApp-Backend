package com.Feelfree2code.STA.subStructure;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import com.Feelfree2code.STA.common.AddVM;
import com.Feelfree2code.STA.common.BaseDTO;
import com.Feelfree2code.STA.common.BaseVM;
import com.Feelfree2code.STA.common.UpdateVM;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpJpaRepository;

/**
 * baseRepository
 */
public class baseRepository<T extends BaseDTO, V extends BaseVM, A extends AddVM, U extends UpdateVM, ID extends Serializable>
        extends JpaRepositoryExtension<T, ID>
        implements IBaseRepository<T, V, A, U, ID> {

    private EntityManager entityManager;

    public baseRepository(JpaEntityInformation<T, ID> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    @Transactional
    public List<T> findByAttributeContainsText(String attributeName, String text) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> cQuery = builder.createQuery(getDomainClass());
        Root<T> root = cQuery.from(getDomainClass());
        cQuery.select(root).where(builder.like(root.<String>get(attributeName), "%" + text + "%"));
        TypedQuery<T> query = entityManager.createQuery(cQuery);
        return query.getResultList();
    }

 
}