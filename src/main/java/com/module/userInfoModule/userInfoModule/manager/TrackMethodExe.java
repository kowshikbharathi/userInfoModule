package com.module.userInfoModule.userInfoModule.manager;

import org.aspectj.lang.annotation.Aspect;

/**
 * TrackMethodExe class used to generate logics for AOP.
 * @author Kowshik Bharathi M
 */
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.slf4j.LoggerFactory;

@Aspect
@Component
public class TrackMethodExe {

    Logger logger=LoggerFactory.getLogger(TrackMethodExe.class);
	
	@Around("@annotation(com.module.userInfoModule.userInfoModule.manager.TrackProcessDuration)")
	public Object trackTime(ProceedingJoinPoint joinPoint) throws Throwable {
		long stratTime=System.currentTimeMillis();
		Object object=joinPoint.proceed();
		long endTime=System.currentTimeMillis();
		logger.info("Method name"+joinPoint.getSignature()+" Execution Time : "+(endTime-stratTime));
		return object;
	}
}
