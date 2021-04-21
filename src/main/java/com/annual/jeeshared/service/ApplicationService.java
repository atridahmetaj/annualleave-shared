package com.annual.jeeshared.service;

import com.annual.jeeshared.entity.Application;
import com.annual.jeeshared.entity.User;
import com.annual.jeeshared.repository.ApplicationRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService extends GenericService<Application, ApplicationRepository>{

    @Autowired
    public ApplicationService(ApplicationRepository applicationRepository) {
        this.repository = applicationRepository;
    }

    private static final Logger logger = LogManager.getLogger(UserService.class);

    public List<Application> getAllApplications(){
        logger.debug("Retrieving all applications");
        return repository.findAll();
    }

    public List<Application> getUserApplications(User user){
        logger.debug("Retrieving all user applications");
        return repository.findApplicationsByRequestedBy(user);
    }

    public void deleteAllApplications(){
        logger.debug("Deleting all users applications");
        repository.deleteAll();
    }
}
