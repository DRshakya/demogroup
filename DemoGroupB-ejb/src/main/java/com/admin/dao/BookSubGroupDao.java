/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.dao;

import com.admin.dto.BookSubGroupDto;
import com.payrollSystem.entity.common.BookSubGroup;
import javax.ejb.Local;

/**
 *
 * @author Administrator
 */
@Local
public interface BookSubGroupDao extends StatusableDao<BookSubGroup>  {
    
    
}
