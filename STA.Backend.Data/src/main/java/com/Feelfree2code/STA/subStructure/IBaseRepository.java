package com.Feelfree2code.STA.subStructure;

import java.io.Serializable;
import java.util.List;

import com.Feelfree2code.STA.common.AddVM;
import com.Feelfree2code.STA.common.BaseDTO;
import com.Feelfree2code.STA.common.BaseVM;
import com.Feelfree2code.STA.common.UpdateVM;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


/**
 * IBaseRepository
 */
@NoRepositoryBean
public interface IBaseRepository
    <T extends BaseDTO, V extends BaseVM, A extends AddVM, U extends UpdateVM, ID extends Serializable>
    extends JpaRepository<T, ID>  {

    List<T> findByAttributeContainsText(String attributeName, String text);
}