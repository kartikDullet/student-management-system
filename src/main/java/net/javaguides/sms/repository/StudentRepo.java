package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.sms.entity.Student;

public interface StudentRepo extends JpaRepository< Student , Long >{
        
	 
}
