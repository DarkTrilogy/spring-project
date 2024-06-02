package com.abii.spring.database.repository;

import com.abii.spring.database.entity.Role;
import com.abii.spring.database.entity.User;
import com.abii.spring.dto.PersonalInfo;
import com.abii.spring.dto.UserFilter;

import java.util.List;

public interface FilterUserRepository {

    List<User> findAllByFilter(UserFilter filter);

    List<PersonalInfo> findAllByCompanyIdAndRole(Integer companyId, Role role);

    void updateCompanyAndRole(List<User> users);

    void updateCompanyAndRoleNamed(List<User> users);
}
