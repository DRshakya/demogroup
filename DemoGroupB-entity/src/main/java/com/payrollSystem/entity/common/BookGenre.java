/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payrollSystem.entity.common;

import com.payrollSystem.entity.abstracts.AbstractProfile;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Administrator
 */
@Getter
@Setter
@Entity
@Table(name = "BOOK_GENRE")
@NamedQueries({
    @NamedQuery(name = "BookGenre.findAll", query = "SELECT bge FROM BookGenre bge"),
    @NamedQuery(name = "BookGenre.findByBookGenreId", query = "SELECT bge FROM BookGenre bge WHERE bge.id = :id")})
public class BookGenre extends AbstractProfile {
    
}
