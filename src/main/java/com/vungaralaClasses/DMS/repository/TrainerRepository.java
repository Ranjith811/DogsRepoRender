/*@author Ranjith Vungarala*/

package com.vungaralaClasses.DMS.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vungaralaClasses.DMS.Models.Dog;
import com.vungaralaClasses.DMS.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}
